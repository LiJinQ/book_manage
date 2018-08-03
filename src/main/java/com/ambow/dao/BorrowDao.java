package com.ambow.dao;

import java.util.List;

import com.ambow.pojo.Borrow;

public interface BorrowDao {
	public void newBorrow(Borrow borrow);
	public void updateBorrow(Borrow borrow);
	public void deleteBorrowById(int borrowId);
	public Borrow getBorrowById(int borrowId);
	public List<Borrow> getAllBorrow();
}
