package com.ambow.pojo;

import java.util.Date;

public class Bookinfo {
    private int bookId;

    private int bookTypeId;

    private String bookName;

    private String writer;

    private String translator;

    private Date publishData;

    private String publishHouse;

    private float price;

    private boolean isborrow;

    private Date borrowData;

    private float borrowPrice;
    
    private int bookNum;

	public Bookinfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bookinfo(int bookId, int bookTypeId, String bookName, String writer, String translator, Date publishData,
			String publishHouse, float price, boolean isborrow, Date borrowData, float borrowPrice, int bookNum) {
		super();
		this.bookId = bookId;
		this.bookTypeId = bookTypeId;
		this.bookName = bookName;
		this.writer = writer;
		this.translator = translator;
		this.publishData = publishData;
		this.publishHouse = publishHouse;
		this.price = price;
		this.isborrow = isborrow;
		this.borrowData = borrowData;
		this.borrowPrice = borrowPrice;
		this.bookNum = bookNum;
	}

	@Override
	public String toString() {
		return "Bookinfo [bookId=" + bookId + ", bookTypeId=" + bookTypeId + ", bookName=" + bookName + ", writer="
				+ writer + ", translator=" + translator + ", publishData=" + publishData + ", publishHouse="
				+ publishHouse + ", price=" + price + ", isborrow=" + isborrow + ", borrowData=" + borrowData
				+ ", borrowPrice=" + borrowPrice + ", bookNum=" + bookNum + "]";
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getBookTypeId() {
		return bookTypeId;
	}

	public void setBookTypeId(int bookTypeId) {
		this.bookTypeId = bookTypeId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTranslator() {
		return translator;
	}

	public void setTranslator(String translator) {
		this.translator = translator;
	}

	public Date getPublishData() {
		return publishData;
	}

	public void setPublishData(Date publishData) {
		this.publishData = publishData;
	}

	public String getPublishHouse() {
		return publishHouse;
	}

	public void setPublishHouse(String publishHouse) {
		this.publishHouse = publishHouse;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isIsborrow() {
		return isborrow;
	}

	public void setIsborrow(boolean isborrow) {
		this.isborrow = isborrow;
	}

	public Date getBorrowData() {
		return borrowData;
	}

	public void setBorrowData(Date borrowData) {
		this.borrowData = borrowData;
	}

	public float getBorrowPrice() {
		return borrowPrice;
	}

	public void setBorrowPrice(float borrowPrice) {
		this.borrowPrice = borrowPrice;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	
    
    
}