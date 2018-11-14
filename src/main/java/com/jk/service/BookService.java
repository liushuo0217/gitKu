package com.jk.service;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.jk.model.BookBean;
import com.jk.model.NavBean;
import com.jk.model.TypeBean;

public interface BookService {


	Map<String, Object> queryBook() throws ParseException;

	List<NavBean> getNavTree();

	void addBook(HashMap<String, Object> map);

	void delbook(String id);

	BookBean updatebyId(String id);

	List<TypeBean> queryType();

	void updates(BookBean bookBean);
	
	Boolean addBook1(List<BookBean> bookList);


	
	

}
