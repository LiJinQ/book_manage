package com.ambow.pojo;

import java.util.Date;
import java.util.List;

public class EmpBuyBook {
    private int id;

    private int empId;

    private int bookId;
    
    private Date buyDate;
    
    private List<Status> lists;

	public EmpBuyBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpBuyBook(int id, int empId, int bookId, Date buyDate, List<Status> lists) {
		super();
		this.id = id;
		this.empId = empId;
		this.bookId = bookId;
		this.buyDate = buyDate;
		this.lists = lists;
	}

	@Override
	public String toString() {
		return "EmpBuyBook [id=" + id + ", empId=" + empId + ", bookId=" + bookId + ", buyDate=" + buyDate + ", lists="
				+ lists + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public Date getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	public List<Status> getLists() {
		return lists;
	}

	public void setLists(List<Status> lists) {
		this.lists = lists;
	}
	
	
    
    
    
}