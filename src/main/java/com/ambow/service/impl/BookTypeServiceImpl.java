package com.ambow.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambow.dao.BookTypeDao;
import com.ambow.pojo.BookType;
import com.ambow.sercice.BookTypeService;

@Service
public class BookTypeServiceImpl implements BookTypeService{

	@Autowired
	private BookTypeDao btd;
	
	@Override
	public void newBookType(BookType bookType) {
		// TODO Auto-generated method stub
		btd.newBookType(bookType);
	}

	@Override
	public void deleteBookTypeById(int id) {
		// TODO Auto-generated method stub
		btd.deleteBookTypeById(id);
	}

	@Override
	public void updateBookType(BookType bookType) {
		// TODO Auto-generated method stub
		btd.updateBookType(bookType);
	}

	@Override
	public List<BookType> getAllBookType() {
		// TODO Auto-generated method stub
		return btd.getAllBookType();
	}

	@Override
	public BookType getBookTypeByName(String name) {
		// TODO Auto-generated method stub
		return btd.getBookTypeByIdOrName(0, name);
	}

}
