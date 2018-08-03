package com.ambow.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ambow.pojo.Readerinfo;
import com.ambow.sercice.ReaderinfoService;
import com.ambow.vo.BorrowHistory;

@Service
public class ReaderinfoServiceImpl implements ReaderinfoService {

	@Override
	public void newReaderinfo(Readerinfo readerinfo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateReaderinfo(Readerinfo readerinfo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteReaderinfoById(int readerId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Readerinfo> getReaderinfoByReaderName(String readerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Readerinfo> getReaderinfoByReaderTel(String readerTel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BorrowHistory> getBorrowHistoryByReaderId(int readerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
