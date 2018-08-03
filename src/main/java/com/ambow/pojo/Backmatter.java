package com.ambow.pojo;

public class Backmatter {
    private int backmatterId;

    private String backmatterType;

    private String backmatterName;

    private int bookId;

	public Backmatter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Backmatter(int backmatterId, String backmatterType, String backmatterName, int bookId) {
		super();
		this.backmatterId = backmatterId;
		this.backmatterType = backmatterType;
		this.backmatterName = backmatterName;
		this.bookId = bookId;
	}

	@Override
	public String toString() {
		return "Backmatter [backmatterId=" + backmatterId + ", backmatterType=" + backmatterType + ", backmatterName="
				+ backmatterName + ", bookId=" + bookId + "]";
	}

	public int getBackmatterId() {
		return backmatterId;
	}

	public void setBackmatterId(int backmatterId) {
		this.backmatterId = backmatterId;
	}

	public String getBackmatterType() {
		return backmatterType;
	}

	public void setBackmatterType(String backmatterType) {
		this.backmatterType = backmatterType;
	}

	public String getBackmatterName() {
		return backmatterName;
	}

	public void setBackmatterName(String backmatterName) {
		this.backmatterName = backmatterName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
    
    
    
}