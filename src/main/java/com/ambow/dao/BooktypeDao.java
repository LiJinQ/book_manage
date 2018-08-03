package com.ambow.dao;

import java.util.List;

import com.ambow.pojo.Booktype;

public interface BooktypeDao {
	public void newBooktype(Booktype booktype);
	public void updateBooktype(Booktype booktype);
	public void deleteBooktypeById(int booktypeId);
	public Booktype getBooktypeById(int booktypeId);
	public List<Booktype> getAllBooktype();
}
