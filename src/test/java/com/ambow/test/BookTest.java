package com.ambow.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ambow.dao.BookDao;
import com.ambow.pojo.Book;
import com.ambow.sercice.BookService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-db.xml","classpath:spring-mvc.xml","classpath:spring.xml"})
public class BookTest {
	
	@Autowired
	private BookDao bd;
	@Autowired
	private BookService bs;
	
	@Test
	public void testNew() {
		Date date = new Date();
		Book book = new Book(0, "20010101001", 1, "aa", "aa", "aa", "aa", date, 3, 1, 1);
		bd.newBook(book);
	}
	
	@Test
	public void testUpDate() {
		Date date = new Date();
		Book book = new Book(0, "20010101001", 2, "aa", "aa", "aa", "aa", date, 3, 1, 1);
		bd.updateBook(book); 
	}
	@Test
	public void testDelete() {
		bd.deleteBookById(0);
	}
	@Test
	public void testGet() {
		System.out.println(bs.getBookBySearch(0, "1"));
	}
	

}
