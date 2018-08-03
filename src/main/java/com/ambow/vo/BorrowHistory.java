package com.ambow.vo;

import com.ambow.pojo.Borrow;
/**
 * ���ڲ�ѯ�鼮������ʷ��Ϣ
 * @author LJQ
 *
 */
public class BorrowHistory {
	/**
	 * �鼮����
	 */
	private String bookName;
	/**
	 * Borrowʵ����
	 * ���ڴ���鼮������Ϣ
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
