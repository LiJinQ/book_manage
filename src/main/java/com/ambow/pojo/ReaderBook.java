package com.ambow.pojo;

import java.util.Date;

public class ReaderBook {
    private int id;

    private int readerId;

    private int bookId;

    private Date startDate;

    private Date backDate;

    private float price;

	public ReaderBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReaderBook(int id, int readerId, int bookId, Date startDate, Date backDate, float price) {
		super();
		this.id = id;
		this.readerId = readerId;
		this.bookId = bookId;
		this.startDate = startDate;
		this.backDate = backDate;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ReaderBook [id=" + id + ", readerId=" + readerId + ", bookId=" + bookId + ", startDate=" + startDate
				+ ", backDate=" + backDate + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getReaderId() {
		return readerId;
	}

	public void setReaderId(int readerId) {
		this.readerId = readerId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getBackDate() {
		return backDate;
	}

	public void setBackDate(Date backDate) {
		this.backDate = backDate;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

    
}