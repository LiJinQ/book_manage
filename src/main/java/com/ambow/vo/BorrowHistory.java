package com.ambow.vo;

import com.ambow.pojo.Borrow;
/**
 * 用于查询书籍借阅历史信息
 * @author LJQ
 *
 */
public class BorrowHistory {
	/**
	 * 书籍名称
	 */
	private String bookName;
	/**
	 * Borrow实体类
	 * 用于存放书籍借阅信息
	 */
	private Borrow borrow;
	public BorrowHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BorrowHistory(String bookName, Borrow borrow) {
		super();
		this.bookName = bookName;
		this.borrow = borrow;
	}
	@Override
	public String toString() {
		return "BorrowHistory [bookName=" + bookName + ", borrow=" + borrow + "]";
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Borrow getBorrow() {
		return borrow;
	}
	public void setBorrow(Borrow borrow) {
		this.borrow = borrow;
	}
	
}
