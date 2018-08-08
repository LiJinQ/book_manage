package com.ambow.sercice;

import java.util.List;

import com.ambow.pojo.ReaderBook;
import com.ambow.vo.Pager;

public interface ReaderBookService {
	/**
	 * 0:成功
	 * 1：库存不足
	 * 2：读者有欠款项
	 * 3：插入失败
	 * @param readerBook
	 * @return
	 */
	public int borrowBook(ReaderBook readerBook);
	public int backBook(int readerBookId);
	/**
	 * @param id 主键
	 * @param lost	1：已丢失
	 * @param damaged	2：已损坏
	 * @return
	 */
	public ReaderBook getBackPrice(int id,int lost,int damaged);
	public Pager<ReaderBook> getReaderBookByReaderId(int pageNum,int readerId);
	public Pager<ReaderBook> getReaderBookByBookId(int pageNum,int bookId);
	public Pager<ReaderBook> getAllReaderBook(int pageNum);
	public ReaderBook getReaderBookById(int id);
	
	public List<ReaderBook> getReaderBookByBookId2(int bookId);
}
