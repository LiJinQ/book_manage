package com.ambow.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambow.dao.BookDao;
import com.ambow.pojo.Book;
import com.ambow.sercice.BookService;

@Service(value="BookServiceImpl")
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao bd;
	
	@Override
	public int newBook(Book book) {
		// TODO Auto-generated method stub
		return bd.newBook(book);
	}

	@Override
	public int updateBook(Book book) {
		// TODO Auto-generated method stub
		return bd.updateBook(book);
	}

	@Override
	public int deleteBookById(int id) {
		// TODO Auto-generated method stub
		return bd.deleteBookById(id);
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

	@Override
	public List<Book> getBookBySearch(String content) {
		// TODO Auto-generated method stub
		return bd.getBookBySearch("%"+content+"%");
	}
}
