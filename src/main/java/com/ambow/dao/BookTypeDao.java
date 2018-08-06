package com.ambow.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ambow.pojo.BookType;

public interface BookTypeDao {
	
	public int newBookType(BookType booktype);

	public int updateBookType(BookType booktype);

	public int deleteBookTypeById(int id);
	
	public BookType getBookTypeByIdOrName(@Param("id")int id,@Param("name")String name);
	
	public List<BookType> getAllBookType();

}
