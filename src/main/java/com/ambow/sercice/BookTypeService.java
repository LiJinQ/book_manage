package com.ambow.sercice;

import java.util.List;

import com.ambow.pojo.BookType;

public interface BookTypeService {
	public void newBookType(BookType bookType);
	public void deleteBookTypeById(int id);
	public void updateBookType(BookType bookType);
	public List<BookType> getAllBookType();
	public BookType getBookTypeByName(String name);
}
