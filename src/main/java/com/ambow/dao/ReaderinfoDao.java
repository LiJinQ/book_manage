package com.ambow.dao;

import java.util.List;
import com.ambow.pojo.Readerinfo;


public interface ReaderinfoDao {
	public List<Readerinfo> getAllReaderinfo();
	public Readerinfo getReaderinfoById(int id);
	public int newReaderinfo(Readerinfo readerinfo);
	public int deleteReaderinfo(int id);
	public int updateReaderinfo(Readerinfo readerinfo);
}
