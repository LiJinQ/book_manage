package com.ambow.dao;

import java.util.List;

import com.ambow.pojo.EmpBuyBook;

public interface EmpBuyBookDao {
	
	public void newEmpBuyBook(EmpBuyBook empBuyBook);
	
	public void updateEmpBuyBook(EmpBuyBook empBuyBook);
	
	/**
	 * 根据用户id查询申请信息状态
	 * @param empId
	 * @return
	 */
	public List<EmpBuyBook> getEmpBuyBookByEmpId(int empId);
	
	public List<EmpBuyBook> getAllEmpBuyBook();
	
	public EmpBuyBook getEmpBuyBookById(int id);
}
