package com.ambow.pojo;

public class Menu {
	private int id;
	private int parentId;
	private String name;
	private String url;
	private int level;
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(int id, int parentId, String name, String url, int level) {
		super();
		this.id = id;
		this.parentId = parentId;
		this.name = name;
		this.url = url;
		this.level = level;
	}
	@Override
	public String toString() {
		return "Menu [id=" + id + ", parentId=" + parentId + ", name=" + name + ", url=" + url + ", level=" + level
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
}
