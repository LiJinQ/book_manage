package com.ambow.vo;

public class PagerVo {
	/**
	 * 页码
	 */
	private int pageNum;
	/**
	 * 查询内容
	 */
	private String content;
	/**
	 * 借阅变量
	 */
	private int lost;
	private int damaged;
	/**
	 * 类型id
	 */
	private int typeId;
	/**
	 * 读者id
	 */
	private int readerId;
	/**
	 * 图书id
	 */
	private int bookId;
	private int readerBookId;
	public int getReaderBookId() {
		return readerBookId;
	}

	public void setReaderBookId(int readerBookId) {
		this.readerBookId = readerBookId;
	}

	public PagerVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getLost() {
		return lost;
	}
	public void setLost(int lost) {
		this.lost = lost;
	}
	public int getDamaged() {
		return damaged;
	}
	public void setDamaged(int damaged) {
		this.damaged = damaged;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public int getReaderId() {
		return readerId;
	}
	public void setReaderId(int readerId) {
		this.readerId = readerId;
	}
	
	
	
}
