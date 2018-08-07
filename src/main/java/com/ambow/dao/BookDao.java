package com.ambow.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ambow.pojo.Book;
import com.ambow.vo.Pager;

public interface BookDao {
	
	public int newBook(Book book);
	
	public int updateBook(Book book);
	
	public int deleteBookById(int id);

	public List<Book> getBookByTypeIdOrName(@Param("typeId")int typeId,@Param("name")String name);
	
	public Book getBookById(int id);
	
	public List<Book> getAllBook();
	
	public List<Book> getBookBySearch(String content);
	
	public List<Book> getBookPagerByTypeIdOrName(@Param("pager")Pager<Book> pager,@Param("typeId")int typeId,@Param("name")String name);
	
	public List<Book> getBookPagerBySearch(@Param("pager")Pager<Book> pager,@Param("content")String content);

	public int getTotalRecord(@Param("typeId")int typeId,@Param("name")String name);
	
	public int getSearchTotalRecord(String content);
}
