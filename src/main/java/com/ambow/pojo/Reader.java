package com.ambow.pojo;

import java.util.Date;

public class Reader {
    private int id;

    private String number;

    private String name;

    private String sex;

    private Date entryTime;

    private String address;

    private String tel;

    private String identity;

	public Reader() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reader(int id, String number, String name, String sex, Date entryTime, String address, String tel,
			String identity) {
		super();
		this.id = id;
		this.number = number;
		this.name = name;
		this.sex = sex;
		this.entryTime = entryTime;
		this.address = address;
		this.tel = tel;
		this.identity = identity;
	}

	@Override
	public String toString() {
		return "Reader [id=" + id + ", number=" + number + ", name=" + name + ", sex=" + sex + ", entryTime="
				+ entryTime + ", address=" + address + ", tel=" + tel + ", identity=" + identity + "]";
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

    
}