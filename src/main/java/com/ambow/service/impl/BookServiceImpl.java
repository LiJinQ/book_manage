package com.ambow.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambow.dao.BookDao;
import com.ambow.pojo.Book;
import com.ambow.sercice.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao bd;
	
	@Override
	public void newBook(Book book) {
		// TODO Auto-generated method stub
		bd.newBook(book);
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		bd.updateBook(book);
	}

	@Override
	public void deleteBookById(int id) {
		// TODO Auto-generated method stub
		bd.deleteBookById(id);
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return bd.getBookById(id);
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return bd.getAllBook();
	}

	@Override
	public List<Book> getBookByTypeId(int typeId) {
		// TODO Auto-generated method stub
		return bd.getBookByTypeIdOrName(typeId, null);
	}

	@Override
	public List<Book> getBookByName(String name) {
		// TODO Auto-generated method stub
		return bd.getBookByTypeIdOrName(0, name);
	}

}
