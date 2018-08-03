package com.ambow.pojo;

public class Booktype {
    private int bookTypeId;

    private String bookTypeName;

	public Booktype() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booktype(int bookTypeId, String bookTypeName) {
		super();
		this.bookTypeId = bookTypeId;
		this.bookTypeName = bookTypeName;
	}

	@Override
	public String toString() {
		return "Booktype [bookTypeId=" + bookTypeId + ", bookTypeName=" + bookTypeName + "]";
	}

	public int getBookTypeId() {
		return bookTypeId;
	}

	public void setBookTypeId(int bookTypeId) {
		this.bookTypeId = bookTypeId;
	}

	public String getBookTypeName() {
		return bookTypeName;
	}

	public void setBookTypeName(String bookTypeName) {
		this.bookTypeName = bookTypeName;
	}

   
}