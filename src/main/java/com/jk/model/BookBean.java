package com.jk.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="book")
public class BookBean implements Serializable{
	
	private static final long serialVersionUID = -31133030875948155L;
	
	private String bookid;
	private String bookname;
	private String time;
	private String type;

	
	private List<BookBean> busList;
	
	
	
	private HashMap<String, Object> map;



	public String getBookid() {
		return bookid;
	}



	public void setBookid(String bookid) {
		this.bookid = bookid;
	}



	public String getBookname() {
		return bookname;
	}



	public void setBookname(String bookname) {
		this.bookname = bookname;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public List<BookBean> getBusList() {
		return busList;
	}



	public void setBusList(List<BookBean> busList) {
		this.busList = busList;
	}



	public HashMap<String, Object> getMap() {
		return map;
	}



	public void setMap(HashMap<String, Object> map) {
		this.map = map;
	}
	
	
	
	
	
}
