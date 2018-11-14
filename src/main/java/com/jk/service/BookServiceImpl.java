package com.jk.service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.jk.dao.BookMapper;
import com.jk.model.BookBean;
import com.jk.model.NavBean;
import com.jk.model.TypeBean;


public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookMapper bookMapper;
	
	@Autowired
	@Lazy
	private MongoTemplate mongoTemplate;

	

	@Override
	public Map<String, Object> queryBook(){
		Query query = new Query();
		long count = mongoTemplate.count(query,"book");
		List<LinkedHashMap> find = mongoTemplate.findAll(LinkedHashMap.class,"book");
		
		for (int i = 0; i < find.size(); i++) {
			HashMap hashMap = find.get(i);
			String type = (String) hashMap.get("type");
			HashMap findOne = mongoTemplate.findOne(new Query(Criteria.where("tid").is(type)),HashMap.class,"typeBean");
			hashMap.put("tname",findOne);
		}
		Map<String, Object> map=new HashMap<>();
		map.put("total",count);
		map.put("rows",find);
		return map;
	}
	
	@Override
	public void addBook(HashMap<String, Object> map) {
		map.put("bookid",UUID.randomUUID().toString());
		mongoTemplate.insert(map,"book");
	}

	@Override
	public List<NavBean> getNavTree() {
		String id = "0";
		List<NavBean> nodes = getNodes(id);
		return nodes;
	}
	private List<NavBean> getNodes(String id){
		List<NavBean> ListNodes = bookMapper.getNodes(id);
		for (NavBean nav : ListNodes) {
			List<NavBean> nodes = getNodes(nav.getId());	
			if(nodes != null && nodes.size() > 0) {	
				nav.setLeaf(false);
				nav.setSelectable(false);
				nav.setNodes(nodes);	
			}else {
				nav.setLeaf(true);
				nav.setSelectable(true);	
			}
		}
		return ListNodes;
		
	}

	

	@Override
	public void delbook(String id) {
		Query query = Query.query(Criteria.where("bookid").is(id));
		mongoTemplate.remove(query,BookBean.class);
	}

	@Override
	public BookBean updatebyId(String id) {
		Query query = Query.query(Criteria.where("bookid").is(id));
		BookBean bean = mongoTemplate.findOne(query, BookBean.class);
		return bean;
	}

	@Override
	public List<TypeBean> queryType() {
		Query query = new Query();
		List<TypeBean> list= mongoTemplate.find(query,TypeBean.class,"typeBean");
		return list;
	}

	@Override
	public void updates(BookBean bookBean) {
		mongoTemplate.updateFirst(new Query(Criteria.where("bookid").is(bookBean.getBookid())),new Update().set("bookname",bookBean.getBookname()).set("time", bookBean.getTime()),BookBean.class);
	}
	
	@Override
	public Boolean addBook1(List<BookBean> bookList) {
		// TODO Auto-generated method stub
		try {
				mongoTemplate.save(bookList.get(0),"book");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
		
	}

	
}
