package com.ambow.sercice;

import java.util.List;

import com.ambow.pojo.Book;
import com.ambow.vo.Pager;

public interface BookService {
	public int newBook(Book book);
	public int updateBook(Book book);
	public int deleteBookById(int id);
	public Book getBookById(int id);
	public List<Book> getAllBook();
	public List<Book> getBookByTypeId(int typeId);
	public List<Book> getBookByName(String name);
	public List<Book> getBookBySearch(String content);
	
	public Pager<Book> getAllBookPager(int pageNum);
	public Pager<Book> getBookByName(int pageNum,String name);
	public Pager<Book> getBookByTypeId(int pageNum,int typeId);
	public Pager<Book> getBookBySearch(int pageNum,String content);
	
}
