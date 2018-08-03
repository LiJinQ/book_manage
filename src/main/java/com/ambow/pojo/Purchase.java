package com.ambow.pojo;

public class Purchase {
	private int purchaseNo;

	private int purchaseId;

	private String bookId;

	private String purchaseReason;

	private String applicationData;

	private String applicationState;

	private String readerTel;

	private String readerAddress;

	private String remark;

	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Purchase(int purchaseNo, int purchaseId, String bookId, String purchaseReason, String applicationData,
			String applicationState, String readerTel, String readerAddress, String remark) {
		super();
		this.purchaseNo = purchaseNo;
		this.purchaseId = purchaseId;
		this.bookId = bookId;
		this.purchaseReason = purchaseReason;
		this.applicationData = applicationData;
		this.applicationState = applicationState;
		this.readerTel = readerTel;
		this.readerAddress = readerAddress;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Purchase [purchaseNo=" + purchaseNo + ", purchaseId=" + purchaseId + ", bookId=" + bookId
				+ ", purchaseReason=" + purchaseReason + ", applicationData=" + applicationData + ", applicationState="
				+ applicationState + ", readerTel=" + readerTel + ", readerAddress=" + readerAddress + ", remark="
				+ remark + "]";
	}

	public int getPurchaseNo() {
		return purchaseNo;
	}

	public void setPurchaseNo(int purchaseNo) {
		this.purchaseNo = purchaseNo;
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getPurchaseReason() {
		return purchaseReason;
	}

	public void setPurchaseReason(String purchaseReason) {
		this.purchaseReason = purchaseReason;
	}

	public String getApplicationData() {
		return applicationData;
	}

	public void setApplicationData(String applicationData) {
		this.applicationData = applicationData;
	}

	public String getApplicationState() {
		return applicationState;
	}

	public void setApplicationState(String applicationState) {
		this.applicationState = applicationState;
	}

	public String getReaderTel() {
		return readerTel;
	}

	public void setReaderTel(String readerTel) {
		this.readerTel = readerTel;
	}

	public String getReaderAddress() {
		return readerAddress;
	}

	public void setReaderAddress(String readerAddress) {
		this.readerAddress = readerAddress;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	
}