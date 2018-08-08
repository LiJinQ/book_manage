package com.ambow.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambow.dao.EmpBuyBookDao;
import com.ambow.dao.StatusDao;
import com.ambow.pojo.EmpBuyBook;
import com.ambow.pojo.Status;
import com.ambow.sercice.EmpBuyBookService;

@Service
public class EmpBuyBookServiceImpl implements EmpBuyBookService{
	@Autowired
	private EmpBuyBookDao ebbd;
	@Autowired
	private StatusDao sd;

	@Override
	public int applyBuy(EmpBuyBook ebb) {
		// TODO Auto-generated method stub
		Date now = new Date();
		ebb.setBuyDate(now);
		if(ebbd.newEmpBuyBook(ebb)<=0) {
			return 0;
		}
		Status status = new Status(0, ebb.getId(), ebb.getEmpId(), 1, 4, now);
		return sd.newStatus(status);
	}

}
