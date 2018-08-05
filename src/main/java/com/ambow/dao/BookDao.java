package com.ambow.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ambow.pojo.Book;

public interface BookDao {
	
	public void newBook(Book book);
	
	public void updateBook(Book book);
	
	public void deleteBookById(int id);
	
	/**
	 * 根据图书类型名称、图书名称
	 * @param typeId
	 * @param name
	 * @return
	 */
	public List<Book> getBookByTypeIdOrName(@Param("typeId")int typeId,@Param("name")String name);
	
	public Book getBookById(int id);
	
	public List<Book> getAllBook();
}
