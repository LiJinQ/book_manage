package com.ambow.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ambow.pojo.ReaderBook;
import com.ambow.vo.Pager;

public interface ReaderBookDao {
	
	public int newReaderBook(ReaderBook readerBook);
	
	public int updateReaderBook(ReaderBook readerBook);
	
	public List<ReaderBook> getReaderBookByReaderId(int readerId);
	
	public List<ReaderBook> getReaderBookByBookId(int bookId);
	
	public List<ReaderBook> getReaderBookPagerByReaderIdOrBookId(@Param("pager")Pager<ReaderBook> pager,@Param("readerId")int readerId,@Param("bookId")int bookId);
	
	public List<ReaderBook> getAllReaderBook();
	
	public ReaderBook getReaderBookById(int id);
	
	public Date getNow(); 
	public int getTotalRecord(@Param("readerId")int readerId,@Param("bookId")int bookId);
}
