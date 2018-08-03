package com.ambow.pojo;

import java.util.Date;

public class Purchaseflow {
    private int flowId;

    private int purchaseId;

    private String empId;

    private Date flowData;

    private int flowApplicationState;

    private String applicationState;

    private String remark;

	public Purchaseflow() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Purchaseflow(int flowId, int purchaseId, String empId, Date flowData, int flowApplicationState,
			String applicationState, String remark) {
		super();
		this.flowId = flowId;
		this.purchaseId = purchaseId;
		this.empId = empId;
		this.flowData = flowData;
		this.flowApplicationState = flowApplicationState;
		this.applicationState = applicationState;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Purchaseflow [flowId=" + flowId + ", purchaseId=" + purchaseId + ", empId=" + empId + ", flowData="
				+ flowData + ", flowApplicationState=" + flowApplicationState + ", applicationState=" + applicationState
				+ ", remark=" + remark + "]";
	}

	public int getFlowId() {
		return flowId;
	}

	public void setFlowId(int flowId) {
		this.flowId = flowId;
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Date getFlowData() {
		return flowData;
	}

	public void setFlowData(Date flowData) {
		this.flowData = flowData;
	}

	public int getFlowApplicationState() {
		return flowApplicationState;
	}

	public void setFlowApplicationState(int flowApplicationState) {
		this.flowApplicationState = flowApplicationState;
	}

	public String getApplicationState() {
		return applicationState;
	}

	public void setApplicationState(String applicationState) {
		this.applicationState = applicationState;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

    
}