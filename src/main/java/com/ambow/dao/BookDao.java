package com.ambow.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ambow.pojo.Book;

public interface BookDao {
	
	public int newBook(Book book);
	
	public int updateBook(Book book);
	
	public int deleteBookById(int id);

	public List<Book> getBookByTypeIdOrName(@Param("typeId")int typeId,@Param("name")String name);
	
	public Book getBookById(int id);
	
	public List<Book> getAllBook();
	
	public List<Book> getBookBySearch(String content);
}
