package com.ambow.pojo;

public class BookType {
    private int id;

    private String name;

	public BookType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookType(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "BookType [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    
}