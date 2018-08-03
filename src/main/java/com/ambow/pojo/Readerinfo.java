package com.ambow.pojo;

import java.util.Date;

public class Readerinfo {
    private int readerId;

    private String readerName;

    private String readerSex;

    private Date signData;

    private String socialIdentity;

    private String readerTel;

    private String readerAddress;

	public Readerinfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Readerinfo(int readerId, String readerName, String readerSex, Date signData, String socialIdentity,
			String readerTel, String readerAddress) {
		super();
		this.readerId = readerId;
		this.readerName = readerName;
		this.readerSex = readerSex;
		this.signData = signData;
		this.socialIdentity = socialIdentity;
		this.readerTel = readerTel;
		this.readerAddress = readerAddress;
	}

	@Override
	public String toString() {
		return "Readerinfo [readerId=" + readerId + ", readerName=" + readerName + ", readerSex=" + readerSex
				+ ", signData=" + signData + ", socialIdentity=" + socialIdentity + ", readerTel=" + readerTel
				+ ", readerAddress=" + readerAddress + "]";
	}

	public int getReaderId() {
		return readerId;
	}

	public void setReaderId(int readerId) {
		this.readerId = readerId;
	}

	public String getReaderName() {
		return readerName;
	}

	public void setReaderName(String readerName) {
		this.readerName = readerName;
	}

	public String getReaderSex() {
		return readerSex;
	}

	public void setReaderSex(String readerSex) {
		this.readerSex = readerSex;
	}

	public Date getSignData() {
		return signData;
	}

	public void setSignData(Date signData) {
		this.signData = signData;
	}

	public String getSocialIdentity() {
		return socialIdentity;
	}

	public void setSocialIdentity(String socialIdentity) {
		this.socialIdentity = socialIdentity;
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

    
}