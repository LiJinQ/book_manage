package com.ambow.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ambow.pojo.BookType;

public interface BookTypeDao {
	
	public void newBookType(BookType booktype);

	public void updateBookType(BookType booktype);

	public void deleteBookTypeById(int id);
	
	public BookType getBookTypeByIdOrName(@Param("id")int id,@Param("name")String name);
	
	public List<BookType> getAllBookType();

}
