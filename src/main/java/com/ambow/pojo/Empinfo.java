package com.ambow.pojo;

import java.util.Date;

public class Empinfo {
    private int empId;

    private String loginName;

    private String empName;

    private String empSex;

    private Date entryDate;

    private String empTel;

    private String empAddress;

    private String remark;

    private int roleId;

    private String password;

	public Empinfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empinfo(int empId, String loginName, String empName, String empSex, Date entryDate, String empTel,
			String empAddress, String remark, int roleId, String password) {
		super();
		this.empId = empId;
		this.loginName = loginName;
		this.empName = empName;
		this.empSex = empSex;
		this.entryDate = entryDate;
		this.empTel = empTel;
		this.empAddress = empAddress;
		this.remark = remark;
		this.roleId = roleId;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Empinfo [empId=" + empId + ", loginName=" + loginName + ", empName=" + empName + ", empSex=" + empSex
				+ ", entryDate=" + entryDate + ", empTel=" + empTel + ", empAddress=" + empAddress + ", remark="
				+ remark + ", roleId=" + roleId + ", password=" + password + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSex() {
		return empSex;
	}

	public void setEmpSex(String empSex) {
		this.empSex = empSex;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getEmpTel() {
		return empTel;
	}

	public void setEmpTel(String empTel) {
		this.empTel = empTel;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

   
}