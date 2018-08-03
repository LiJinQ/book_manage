package com.ambow.pojo;

import java.util.Date;

public class Borrow {
    private int borrowId;

    private int booktypeId;

    private int bookId;

    private int readerId;

    private int empId;

    private boolean isback;

    private Date borrowData;

    private Date backData;

    private boolean isdamaged;

    private String canBorrowData;

    private int exceedData;

    private float price;

	public Borrow() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Borrow(int borrowId, int booktypeId, int bookId, int readerId, int empId, boolean isback, Date borrowData,
			Date backData, boolean isdamaged, String canBorrowData, int exceedData, float price) {
		super();
		this.borrowId = borrowId;
		this.booktypeId = booktypeId;
		this.bookId = bookId;
		this.readerId = readerId;
		this.empId = empId;
		this.isback = isback;
		this.borrowData = borrowData;
		this.backData = backData;
		this.isdamaged = isdamaged;
		this.canBorrowData = canBorrowData;
		this.exceedData = exceedData;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Borrow [borrowId=" + borrowId + ", booktypeId=" + booktypeId + ", bookId=" + bookId + ", readerId="
				+ readerId + ", empId=" + empId + ", isback=" + isback + ", borrowData=" + borrowData + ", backData="
				+ backData + ", isdamaged=" + isdamaged + ", canBorrowData=" + canBorrowData + ", exceedData="
				+ exceedData + ", price=" + price + "]";
	}

	public int getBorrowId() {
		return borrowId;
	}

	public void setBorrowId(int borrowId) {
		this.borrowId = borrowId;
	}

	public int getBooktypeId() {
		return booktypeId;
	}

	public void setBooktypeId(int booktypeId) {
		this.booktypeId = booktypeId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getReaderId() {
		return readerId;
	}

	public void setReaderId(int readerId) {
		this.readerId = readerId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public boolean isIsback() {
		return isback;
	}

	public void setIsback(boolean isback) {
		this.isback = isback;
	}

	public Date getBorrowData() {
		return borrowData;
	}

	public void setBorrowData(Date borrowData) {
		this.borrowData = borrowData;
	}

	public Date getBackData() {
		return backData;
	}

	public void setBackData(Date backData) {
		this.backData = backData;
	}

	public boolean isIsdamaged() {
		return isdamaged;
	}

	public void setIsdamaged(boolean isdamaged) {
		this.isdamaged = isdamaged;
	}

	public String getCanBorrowData() {
		return canBorrowData;
	}

	public void setCanBorrowData(String canBorrowData) {
		this.canBorrowData = canBorrowData;
	}

	public int getExceedData() {
		return exceedData;
	}

	public void setExceedData(int exceedData) {
		this.exceedData = exceedData;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

    
}