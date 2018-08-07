package com.ambow.dao;

import java.util.List;

import com.ambow.pojo.EmpBuyBook;

public interface EmpBuyBookDao {
	
	public int newEmpBuyBook(EmpBuyBook empBuyBook);
	
	public EmpBuyBook getEmpBuyBookById(int id);
}
