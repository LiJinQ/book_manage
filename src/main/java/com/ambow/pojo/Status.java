package com.ambow.pojo;

public class Status {
    private int id;

    private int ebbId;

    private int empId;

    private int status;

    private int empLevel;

	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Status(int id, int ebbId, int empId, int status, int empLevel) {
		super();
		this.id = id;
		this.ebbId = ebbId;
		this.empId = empId;
		this.status = status;
		this.empLevel = empLevel;
	}

	@Override
	public String toString() {
		return "Status [id=" + id + ", ebbId=" + ebbId + ", empId=" + empId + ", status=" + status + ", empLevel="
				+ empLevel + "]";
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

    
}