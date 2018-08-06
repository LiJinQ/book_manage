package com.ambow.sercice;

import java.util.List;

import com.ambow.pojo.Book;

public interface BookService {
	public int newBook(Book book);
	public int updateBook(Book book);
	public int deleteBookById(int id);
	public Book getBookById(int id);
	public List<Book> getAllBook();
	public List<Book> getBookByTypeId(int typeId);
	public List<Book> getBookByName(String name);
}
