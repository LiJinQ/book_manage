package com.ambow.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambow.dao.BookDao;
import com.ambow.dao.EmpBuyBookDao;
import com.ambow.dao.StatusDao;
import com.ambow.pojo.Book;
import com.ambow.pojo.EmpBuyBook;
import com.ambow.pojo.Status;
import com.ambow.sercice.EmpBuyBookService;
import com.ambow.vo.Pager;
import com.ambow.vo.PagerVo;
import com.ambow.vo.StatusVo;

@Service
public class EmpBuyBookServiceImpl implements EmpBuyBookService{
	@Autowired
	private EmpBuyBookDao ebbd;
	@Autowired
	private StatusDao sd;
	@Autowired
	private BookDao bd;

	@Override
	public int applyBuy(EmpBuyBook ebb) {
		// TODO Auto-generated method stub
		Date now = new Date();
		ebb.setBuyDate(now);
		if(ebbd.newEmpBuyBook(ebb)<=0) {
			return 0;
		}
		Status status = new Status(0, ebb.getId(), ebb.getEmpId(), 1, 1, now);
		return sd.newStatus(status);
	}

	@Override
	public int examine(Status status) {
		// TODO Auto-generated method stub
		Status ss = sd.getStatusById(status.getId());
		ss.setStatus(status.getStatus());
		ss.setUpdateDate(new Date());
		sd.updateStatus(ss);
		if(status.getStatus()==1) {
			Status s1 = new Status(0, ss.getEbbId(), ss.getEmpId(), 1, ss.getEmpLevel()+1, new Date());
			return sd.newStatus(s1);
		}
		return 1;
	}

	@Override
	public Pager<StatusVo> getStatusNotPass(PagerVo pv) {
		// TODO Auto-generated method stub
		int empLevel = 1;
		if(pv.getRootId()==2) {
			empLevel = 3;
		}else if(pv.getRootId()==2) {
			empLevel = 2;
		}
		int totalRecord = sd.getTotalRecord(empLevel, 0);
		Pager<Status> pager = new Pager<Status>(pv.getPageNum(), 10,totalRecord);
		List<Status> list = sd.getStatusPager(pager, empLevel, 0);
		Pager<StatusVo> pager1 = new Pager<StatusVo>(pv.getPageNum(), 10, totalRecord);
		List<StatusVo> list1 = new ArrayList<StatusVo>();
		for(Status s:list) {
			EmpBuyBook ebb = ebbd.getEmpBuyBookById(s.getEbbId());
			Book book = bd.getBookById(ebb.getBookId());
			StatusVo sv = new StatusVo(s, book);
			list1.add(sv);
		}
		pager1.setList(list1);
		return pager1;
	}

	@Override
	public Pager<StatusVo> getStatusPass(PagerVo pv) {
		// TODO Auto-generated method stub
		int empLevel = 1;
		if(pv.getRootId()==2) {
			empLevel = 3;
		}else if(pv.getRootId()==2) {
			empLevel = 2;
		}
		int totalRecord = sd.getTotalRecord(empLevel, 0);
		Pager<Status> pager = new Pager<Status>(pv.getPageNum(), 10,totalRecord);
		List<Status> list = sd.getStatusPager(pager, empLevel, 1);
		Pager<StatusVo> pager1 = new Pager<StatusVo>(pv.getPageNum(), 10, totalRecord);
		List<StatusVo> list1 = new ArrayList<StatusVo>();
		for(Status s:list) {
			EmpBuyBook ebb = ebbd.getEmpBuyBookById(s.getEbbId());
			Book book = bd.getBookById(ebb.getBookId());
			StatusVo sv = new StatusVo(s, book);
			list1.add(sv);
		}
		pager1.setList(list1);
		return pager1;
	}

	@Override
	public Pager<EmpBuyBook> getEBB(PagerVo pv) {
		// TODO Auto-generated method stub
		int totalRecord = ebbd.getTotalRecord();
		Pager<EmpBuyBook> pager = new Pager<EmpBuyBook>(pv.getPageNum(), 10, totalRecord);
		List<EmpBuyBook> list = ebbd.getEmpBuyBookPager(pager,pv.getBookId());
		pager.setList(list);
		return pager;
	}

}
