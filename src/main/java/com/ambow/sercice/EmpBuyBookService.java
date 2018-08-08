package com.ambow.sercice;

import com.ambow.pojo.EmpBuyBook;
import com.ambow.pojo.Status;

public interface EmpBuyBookService {
	
	/**
	 * 传入empId
	 * bookId
	 * @param ebb
	 * @return
	 */
	public int applyBuy(EmpBuyBook ebb);
	
	/**
	 * id
	 * status
	 * @param status
	 * @return
	 */
	public int examine(Status status);
	
}
