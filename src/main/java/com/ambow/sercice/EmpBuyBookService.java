package com.ambow.sercice;

import com.ambow.pojo.EmpBuyBook;
import com.ambow.pojo.Status;
import com.ambow.vo.Pager;
import com.ambow.vo.PagerVo;
import com.ambow.vo.StatusVo;

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
	
	public Pager<StatusVo> getStatusNotPass(PagerVo pv);
	
	public Pager<StatusVo> getStatusPass(PagerVo pv);
	
	public Pager<EmpBuyBook> getEBB(PagerVo pv);
}
