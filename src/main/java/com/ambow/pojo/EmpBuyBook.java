package com.ambow.pojo;

import java.util.Date;

public class EmpBuyBook {
    private int id;

    private int empId;

    private int bookId;
    
    private Date buyDate;
	public EmpBuyBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpBuyBook(int id, int empId, int bookId, Date buyDate) {
		super();
		this.id = id;
		this.empId = empId;
		this.bookId = bookId;
		this.buyDate = buyDate;
	}
	@Override
	public String toString() {
		return "EmpBuyBook [id=" + id + ", empId=" + empId + ", bookId=" + bookId + ", buyDate=" + buyDate + "]";
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

	
    
    
    
}