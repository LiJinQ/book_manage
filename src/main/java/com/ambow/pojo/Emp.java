package com.ambow.pojo;

import java.util.Date;

public class Emp {
    private int id;

    private String number;

    private String username;

    private String password;

    private String name;

    private int roleId;

    private String sex;

    private Date entryTime;

    private String tel;

    private String address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int id, String number, String username, String password, String name, int roleId, String sex,
			Date entryTime, String tel, String address) {
		super();
		this.id = id;
		this.number = number;
		this.username = username;
		this.password = password;
		this.name = name;
		this.roleId = roleId;
		this.sex = sex;
		this.entryTime = entryTime;
		this.tel = tel;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", number=" + number + ", username=" + username + ", password=" + password + ", name="
				+ name + ", roleId=" + roleId + ", sex=" + sex + ", entryTime=" + entryTime + ", tel=" + tel
				+ ", address=" + address + "]";
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

    
}