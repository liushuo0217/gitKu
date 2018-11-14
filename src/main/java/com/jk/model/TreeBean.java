package com.jk.model;

import java.io.Serializable;

public class TreeBean implements Serializable{
	

	private static final long serialVersionUID = 7555720711915730573L;

	private Integer id;

	 private String text;

	 private Integer pid;

	 private String url;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "TreeBean [id=" + id + ", text=" + text + ", pid=" + pid + ", url=" + url + "]";
	}

	
	 
	 

}
