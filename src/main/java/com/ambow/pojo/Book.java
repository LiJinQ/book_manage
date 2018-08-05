package com.ambow.pojo;

import java.util.Date;

public class Book {
    private int id;

    private String number;

    private int typeId;

    private String name;

    private String author;

    private String translator;

    private String press;

    private Date pressDate;

    private float price;

    private int borrowTime;

    private int stock;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String number, int typeId, String name, String author, String translator, String press,
			Date pressDate, float price, int borrowTime, int stock) {
		super();
		this.id = id;
		this.number = number;
		this.typeId = typeId;
		this.name = name;
		this.author = author;
		this.translator = translator;
		this.press = press;
		this.pressDate = pressDate;
		this.price = price;
		this.borrowTime = borrowTime;
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", number=" + number + ", typeId=" + typeId + ", name=" + name + ", author=" + author
				+ ", translator=" + translator + ", press=" + press + ", pressDate=" + pressDate + ", price=" + price
				+ ", borrowTime=" + borrowTime + ", stock=" + stock + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTranslator() {
		return translator;
	}

	public void setTranslator(String translator) {
		this.translator = translator;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public Date getPressDate() {
		return pressDate;
	}

	public void setPressDate(Date pressDate) {
		this.pressDate = pressDate;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getBorrowTime() {
		return borrowTime;
	}

	public void setBorrowTime(int borrowTime) {
		this.borrowTime = borrowTime;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
    
    

    
}