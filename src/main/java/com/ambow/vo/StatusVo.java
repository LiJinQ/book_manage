package com.ambow.vo;

import com.ambow.pojo.Book;
import com.ambow.pojo.Status;

public class StatusVo {
	private Status status;
	private Book book;
	public StatusVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StatusVo(Status status, Book book) {
		super();
		this.status = status;
		this.book = book;
	}
	@Override
	public String toString() {
		return "StatusVo [status=" + status + ", book=" + book + "]";
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
}
