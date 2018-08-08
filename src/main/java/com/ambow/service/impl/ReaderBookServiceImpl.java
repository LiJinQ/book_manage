package com.ambow.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambow.dao.BookDao;
import com.ambow.dao.ReaderBookDao;
import com.ambow.dao.ReaderDao;
import com.ambow.pojo.Book;
import com.ambow.pojo.Reader;
import com.ambow.pojo.ReaderBook;
import com.ambow.sercice.ReaderBookService;
import com.ambow.util.TimeFormat;
import com.ambow.vo.Pager;

@Service
public class ReaderBookServiceImpl implements ReaderBookService{
	
	@Autowired
	private ReaderBookDao rbd;
	@Autowired
	private BookDao bd;
	@Autowired
	private ReaderDao rd;
	
	private boolean isPrice(int readerId) {
		List<ReaderBook> readerBooks = rbd.getReaderBookByReaderId(readerId);
		for(ReaderBook rb:readerBooks) {
			if(rb.getBackDate()==null) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int borrowBook(ReaderBook readerBook) {
		// TODO Auto-generated method stub
		//传入的值有 读者id，书籍id
		//
		Book book = bd.getBookById(readerBook.getBookId());
		if(book.getStock()-1<0) {
			return 1;
		}
		if(isPrice(readerBook.getReaderId())) {
			return 2;
		}
		book.setStock(book.getStock()-1);
		readerBook.setStartDate(rbd.getNow());
		if(rbd.newReaderBook(readerBook)<=0) {
			return 3;
		}
		bd.updateBook(book);
		return 0;
	}

	@Override
	public int backBook(int readerBookId) {
		// TODO Auto-generated method stub
		ReaderBook readerBook = rbd.getReaderBookById(readerBookId);
		readerBook.setBackDate(new Date());
		return rbd.updateReaderBook(readerBook);
	}

	@Override
	public ReaderBook getBackPrice(int id, int lost, int damaged) {
		// TODO Auto-generated method stub
		ReaderBook readerBook = rbd.getReaderBookById(id);
		Book book = bd.getBookById(readerBook.getBookId());
		if(lost==1||damaged==1) {
			readerBook.setPrice(book.getPrice());
		}else {
			int days = TimeFormat.getDays(new Date(), readerBook.getStartDate())-book.getBorrowTime();
			float price = 0;
			if(days>0) {
				price = (float) (book.getPrice()*days*0.01);
			}
			readerBook.setPrice(price);
		}
		rbd.updateReaderBook(readerBook);
		return readerBook;
	}

	@Override
	public Pager<ReaderBook> getReaderBookByReaderId(int pageNum, int readerId) {
		// TODO Auto-generated method stub
		Pager<ReaderBook> pager = new Pager<ReaderBook>(pageNum, 10, rbd.getTotalRecord(readerId, 0));
		List<ReaderBook> lists = rbd.getReaderBookPagerByReaderIdOrBookId(pager, readerId, 0);
		pager.setList(lists);
		return pager;
	}

	@Override
	public Pager<ReaderBook> getReaderBookByBookId(int pageNum, int bookId) {
		// TODO Auto-generated method stub
		Pager<ReaderBook> pager = new Pager<ReaderBook>(pageNum, 10, rbd.getTotalRecord(0, bookId));
		List<ReaderBook> lists = rbd.getReaderBookPagerByReaderIdOrBookId(pager, 0, bookId);
		pager.setList(lists);
		return pager;
	}

	@Override
	public Pager<ReaderBook> getAllReaderBook(int pageNum) {
		// TODO Auto-generated method stub
		Pager<ReaderBook> pager = new Pager<ReaderBook>(pageNum, 10, rbd.getTotalRecord(0,0));
		List<ReaderBook> lists = rbd.getReaderBookPagerByReaderIdOrBookId(pager, 0, 0);
		pager.setList(lists);
		return pager;
	}

	@Override
	public ReaderBook getReaderBookById(int id) {
		// TODO Auto-generated method stub
		return rbd.getReaderBookById(id);
	}

	@Override
	public List<Reader> getReaderBookByBookId2(int bookId) {
		// TODO Auto-generated method stub
		List<ReaderBook> rbList = rbd.getReaderBookByBookId(bookId);
		List<Reader> list = new ArrayList<Reader>();
		for(ReaderBook rb:rbList) {
			Reader r = rd.getReaderById(rb.getReaderId());
			list.add(r);
		}
		return list;
	}

	
}
