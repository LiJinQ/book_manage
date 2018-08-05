package com.ambow.dao;

import java.util.List;

import com.ambow.pojo.BookType;

public interface BookTypeDao {
	
	public void newBookType(BookType booktype);

	public void updateBookType(BookType booktype);

	public void deleteBookTypeById(int id);
	
	public BookType getBookTypeByIdOrName(int id,String name);
	
	public List<BookType> getAllBookType();

}
