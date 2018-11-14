 
package com.jk.model;

import java.io.Serializable;
import java.util.List;

public class NavBean implements Serializable{

	private static final long serialVersionUID = -7750747270651496781L;

	private String id;
	
	private String text;
	
	private String url;
	
	private String state;
	
	private String pid;
	
	private Boolean checked;
	
	private List<NavBean> nodes;
	
	private Boolean leaf;
	private Boolean selectable;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public Boolean getChecked() {
		return checked;
	}
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	public List<NavBean> getNodes() {
		return nodes;
	}
	public void setNodes(List<NavBean> nodes) {
		this.nodes = nodes;
	}
	public Boolean getLeaf() {
		return leaf;
	}
	public void setLeaf(Boolean leaf) {
		this.leaf = leaf;
	}
	public Boolean getSelectable() {
		return selectable;
	}
	public void setSelectable(Boolean selectable) {
		this.selectable = selectable;
	}

	
	
	
	
	
	
}
