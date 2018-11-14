package com.jk.model;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="typeBean")
public class TypeBean implements Serializable{

	private static final long serialVersionUID = 6219779215995192945L;
	
	private String tid;
	private String tname;
	
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	
	
}
