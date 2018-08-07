package com.ambow.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambow.dao.BookDao;
import com.ambow.dao.BookTypeDao;
import com.ambow.pojo.Book;
import com.ambow.pojo.BookType;
import com.ambow.sercice.BookTypeService;
import com.ambow.vo.Pager;

@Service
public class BookTypeServiceImpl implements BookTypeService {

	@Autowired
	private BookTypeDao btd;
	@Autowired
	private BookDao bd;

	@Override
	public int newBookType(BookType bookType) {
		return btd.newBookType(bookType);
	}

	@Override
	public int deleteBookTypeById(int id) {
		List<Book> list = bd.getBookByTypeIdOrName(id, null);
		if(!list.isEmpty()) {
			return 0;
		}
		return btd.deleteBookTypeById(id);
	}

	@Override
	public int updateBookType(BookType bookType) {
		return btd.updateBookType(bookType);
	}

	@Override
	public List<BookType> getAllBookType() {
		return btd.getAllBookType();
	}

	@Override
	public BookType getBookTypeByName(String name) {
		return btd.getBookTypeByIdOrName(0, name);
	}
	@Override
	public Pager<BookType> getBookTypePager(int pageNum) {
		int totalRecord = btd.getTotalRecord();
		Pager<BookType> pager = new Pager<BookType>(pageNum, 10, totalRecord);
		pager.setList(btd.getBookTypePager(pager));
		return pager;
	}

	@Override
	public Pager<BookType> getBookTypeFindPager(int pageNum, String sth) {
		sth = "%" + sth + "%";
		int totalRecord = btd.getFindTotalRecord(sth);
		Pager<BookType> pager = new Pager<BookType>(pageNum, 10, totalRecord);
		pager.setList(btd.getBookTypeFind(pager, sth));
		return pager;
	}
}
