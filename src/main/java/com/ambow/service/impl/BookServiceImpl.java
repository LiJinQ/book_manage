package com.ambow.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambow.dao.BookDao;
import com.ambow.pojo.Book;
import com.ambow.sercice.BookService;
import com.ambow.util.TimeFormat;
import com.ambow.vo.BookBeBorrow;
import com.ambow.vo.Pager;

@Service(value="BookServiceImpl")
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao bd;
	
	@Override
	public int newBook(Book book) {
		// TODO Auto-generated method stub
		book.setNumber(TimeFormat.getRandomNumber());
		return bd.newBook(book);
	}

	@Override
	public int updateBook(Book book) {
		// TODO Auto-generated method stub
		return bd.updateBook(book);
	}

	@Override
	public int deleteBookById(int id) {
		// TODO Auto-generated method stub
		return bd.deleteBookById(id);
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return bd.getBookById(id);
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return bd.getAllBook();
	}

	@Override
	public List<Book> getBookByTypeId(int typeId) {
		// TODO Auto-generated method stub
		return bd.getBookByTypeIdOrName(typeId, null);
	}

	@Override
	public List<Book> getBookByName(String name) {
		// TODO Auto-generated method stub
		return bd.getBookByTypeIdOrName(0, name);
	}

	@Override
	public List<Book> getBookBySearch(String content) {
		// TODO Auto-generated method stub
		return bd.getBookBySearch("%"+content+"%");
	}

	@Override
	public Pager<Book> getAllBookPager(int pageNum) {
		// TODO Auto-generated method stub
		Pager<Book> pager = new Pager<Book>(pageNum, 10, bd.getTotalRecord(0, null));
		List<Book> list = bd.getBookPagerByTypeIdOrName(pager, 0, null);
		pager.setList(list);
		return pager;
	}

	@Override
	public Pager<Book> getBookByName(int pageNum, String name) {
		// TODO Auto-generated method stub
		Pager<Book> pager = new Pager<Book>(pageNum, 10, bd.getTotalRecord(0, name));
		List<Book> list = bd.getBookPagerByTypeIdOrName(pager, 0, name);
		pager.setList(list);
		return pager;
	}

	@Override
	public Pager<Book> getBookByTypeId(int pageNum, int typeId) {
		// TODO Auto-generated method stub
		Pager<Book> pager = new Pager<Book>(pageNum, 10, bd.getTotalRecord(typeId, null));
		List<Book> list = bd.getBookPagerByTypeIdOrName(pager, typeId, null);
		pager.setList(list);
		return pager;
	}

	@Override
	public Pager<Book> getBookBySearch(int pageNum, String content) {
		// TODO Auto-generated method stub
		content = "%"+content+"%";
		Pager<Book> pager = new Pager<Book>(pageNum, 10, bd.getSearchTotalRecord(content));
		List<Book> list = bd.getBookPagerBySearch(pager, content);
		pager.setList(list);
		return pager;
	}
	
	@Override
	 public List<BookBeBorrow> getBookBeBorrow() {
	  // TODO Auto-generated method stub
	  List<BookBeBorrow> list=new ArrayList<BookBeBorrow>();
	  list=bd.getBookBeBorrow();  
	  return list;
	 }
}
