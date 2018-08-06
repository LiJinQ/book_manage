package com.ambow.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ambow.pojo.Book;

public interface BookDao {
	
	public void newBook(Book book);
	
	public void updateBook(Book book);
	
	public void deleteBookById(int id);

	public List<Book> getBookByTypeIdOrName(@Param("typeId")int typeId,@Param("name")String name);
	
	public Book getBookById(int id);
	
	public List<Book> getAllBook();
}
