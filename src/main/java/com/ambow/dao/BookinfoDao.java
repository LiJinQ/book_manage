package com.ambow.dao;

import java.util.List;

import com.ambow.pojo.Bookinfo;

public interface BookinfoDao {
	public void newBookinfo(Bookinfo bookinfo);
	public void updateBookinfo(Bookinfo bookinfo);
	public void deleteBookinfoById(int bookinfoId);
	public Bookinfo getBookinfoById(int bookinfoId);
	public List<Bookinfo> getAllBookinfo();
}
