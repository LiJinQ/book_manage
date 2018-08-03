package com.ambow.service.impl;

import org.springframework.stereotype.Service;

import com.ambow.pojo.Borrow;
import com.ambow.sercice.BorrowService;

@Service
public class BorrowServiceImpl implements BorrowService {

	@Override
	public boolean borrowBook(Borrow borrow) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public float getReaderPriceByReaderId(int readerId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getReaderPrice(Borrow borrow) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Borrow getBorrowByBorrowId(int borrowId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Borrow backBookByBorrowId(int borrowId) {
		// TODO Auto-generated method stub
		return null;
	}

}
