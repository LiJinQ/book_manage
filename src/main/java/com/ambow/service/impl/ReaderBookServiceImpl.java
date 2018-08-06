package com.ambow.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambow.dao.BookDao;
import com.ambow.dao.ReaderBookDao;
import com.ambow.pojo.Book;
import com.ambow.pojo.ReaderBook;
import com.ambow.sercice.ReaderBookService;
import com.ambow.util.TimeFormat;

@Service
public class ReaderBookServiceImpl implements ReaderBookService{
	
	@Autowired
	private ReaderBookDao rbd;
	@Autowired
	private BookDao bd;
	
	private boolean isPrice(int readerId) {
		List<ReaderBook> readerBooks = rbd.getReaderBookByReaderId(readerId);
		for(ReaderBook rb:readerBooks) {
			if(rb.getPrice()>0) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int borrowBook(ReaderBook readerBook) {
		// TODO Auto-generated method stub
		//传入的值有 读者id，书籍id，startDate
		//
		Book book = bd.getBookById(readerBook.getBookId());
		if(book.getStock()-1<0) {
			return 1;
		}
		if(isPrice(readerBook.getReaderId())) {
			return 2;
		}
		book.setStock(book.getStock()-1);
		bd.updateBook(book);
		readerBook.setBackDate(TimeFormat.addTime(readerBook.getStartDate(), book.getBorrowTime()));
		rbd.newReaderBook(readerBook);
		if(readerBook.getId()<=0) {
			return 3;
		}
		return 0;
	}

	@Override
	public int backBook(ReaderBook readerBook) {
		// TODO Auto-generated method stub
		//传入今天日期，是否损坏
		return 0;
	}

	@Override
	public ReaderBook getBackPrice() {
		// TODO Auto-generated method stub
		return null;
	}

}
