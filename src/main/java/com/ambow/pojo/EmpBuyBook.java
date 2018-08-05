package com.ambow.pojo;

public class EmpBuyBook {
    private int id;

    private int empId;

    private int bookId;

	public EmpBuyBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpBuyBook(int id, int empId, int bookId) {
		super();
		this.id = id;
		this.empId = empId;
		this.bookId = bookId;
	}

	@Override
	public String toString() {
		return "EmpBuyBook [id=" + id + ", empId=" + empId + ", bookId=" + bookId + "]";
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
    
    
    
}