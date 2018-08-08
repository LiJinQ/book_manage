package com.ambow.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ambow.pojo.EmpBuyBook;
import com.ambow.vo.Pager;

public interface EmpBuyBookDao {
	
	public int newEmpBuyBook(EmpBuyBook empBuyBook);
	
	public EmpBuyBook getEmpBuyBookById(int id);
	
	public int getTotalRecord();
	
	public List<EmpBuyBook> getEmpBuyBookPager(Pager<EmpBuyBook> pager);
}
