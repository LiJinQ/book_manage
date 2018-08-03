package com.ambow.dao;

import java.util.List;

import com.ambow.pojo.Empinfo;

public interface EmpinfoDao {
	public void newEmpInfo(Empinfo empinfo);
	public void updateEmpInfo(Empinfo empinfo);
	public void deleteEmpInfoById(int empid);
	public Empinfo getEmpinfoById(int empid);
	public Empinfo getEmpinfoByLoginName(String loginName);
	public List<Empinfo> getAllEmpinfo();
}
