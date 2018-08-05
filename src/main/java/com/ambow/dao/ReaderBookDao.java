package com.ambow.dao;

import java.util.Date;
import java.util.List;

import com.ambow.pojo.ReaderBook;

public interface ReaderBookDao {
	
	public void newReaderBook(ReaderBook readerBook);
	
	public void updateReaderBook(ReaderBook readerBook);
	
	public List<ReaderBook> getReaderBookByReaderId(int readerId);
	
	public List<ReaderBook> getAllReaderBook();
	
	public ReaderBook getReaderBookById(int id);
	
	public Date getNow(); 
}
