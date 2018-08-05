package com.ambow.pojo;

import java.util.Date;

public class Status {
    private int id;

    private int ebbId;

    private int empId;

    private int status;

    private int empLevel;
    
    private Date updateDate;

	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Status(int id, int ebbId, int empId, int status, int empLevel, Date updateDate) {
		super();
		this.id = id;
		this.ebbId = ebbId;
		this.empId = empId;
		this.status = status;
		this.empLevel = empLevel;
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "Status [id=" + id + ", ebbId=" + ebbId + ", empId=" + empId + ", status=" + status + ", empLevel="
				+ empLevel + ", updateDate=" + updateDate + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEbbId() {
		return ebbId;
	}

	public void setEbbId(int ebbId) {
		this.ebbId = ebbId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getEmpLevel() {
		return empLevel;
	}

	public void setEmpLevel(int empLevel) {
		this.empLevel = empLevel;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	

    
}