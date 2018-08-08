package com.ambow.sercice;

import com.ambow.pojo.EmpBuyBook;

public interface EmpBuyBookService {
	
	/**
	 * 传入empId
	 * bookId
	 * @param ebb
	 * @return
	 */
	public int applyBuy(EmpBuyBook ebb);
	
}
