package com.ambow.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ambow.dao.BookTypeDao;
import com.ambow.pojo.BookType;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-db.xml","classpath:spring-mvc.xml","classpath:spring.xml"})
public class BookTypeTest {
	
	@Autowired
	private BookTypeDao bd;
	
	@Test
	public void testNew() {
		BookType book = new BookType(0, "aa");
		bd.newBookType(book);
	}
	
	@Test
	public void testUpDate() {
		BookType book = new BookType(0, "aa");
		bd.updateBookType(book); 
	}
	@Test
	public void testDelete() {
		bd.deleteBookTypeById(0);
	}
	@Test
	public void testGet() {
		System.out.println(bd.getBookTypeByIdOrName(1, null));
	}
	

}
