package com.ambow.sercice;

import java.util.List;

import com.ambow.pojo.BookType;
import com.ambow.vo.Pager;

public interface BookTypeService {
	public int newBookType(BookType bookType);
	public int deleteBookTypeById(int id);
	public int updateBookType(BookType bookType);
	public List<BookType> getAllBookType();
	public BookType getBookTypeByName(String name);
	public Pager<BookType> getBookTypePager(int pageNum);
	public Pager<BookType> getBookTypeFindPager(int pageNum,String sth);

}
