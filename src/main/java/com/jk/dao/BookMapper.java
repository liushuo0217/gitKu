package com.jk.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.jk.model.NavBean;

@Mapper
public interface BookMapper {

	

	@Select("select id,url as url,text as text,pid from t_tree where pid=#{value}")
	List<NavBean> getNodes(String id);

}
