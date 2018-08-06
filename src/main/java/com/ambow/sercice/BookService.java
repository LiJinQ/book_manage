package com.ambow.sercice;

import java.util.List;

import com.ambow.pojo.Book;

public interface BookService {
	public void newBook(Book book);
	public void updateBook(Book book);
	public void deleteBookById(int id);
	public Book getBookById(int id);
	public List<Book> getAllBook();
	public List<Book> getBookByTypeId(int typeId);
	public List<Book> getBookByName(String name);
}
