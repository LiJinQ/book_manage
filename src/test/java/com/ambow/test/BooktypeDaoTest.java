package com.ambow.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ambow.dao.BooktypeDao;
import com.ambow.pojo.Booktype;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-db.xml","classpath:spring-mvc.xml","classpath:spring.xml"})
public class BooktypeDaoTest {

	@Autowired
	private BooktypeDao bd;

	@Test
	public void testNew() {
		Booktype booktype = new Booktype(0, "aa");
		bd.newBooktype(booktype);
	}
	
	@Test
	public void testSelectById() {
		System.out.println(bd.getBooktypeById(1));
	}
	
	
	@Test
	public void testSelectAll() {
		System.out.println(bd.getAllBooktype());
	}
	
	@Test
	public void testUpdate() {
		Booktype booktype = new Booktype(0, "aa");
		bd.updateBooktype(booktype);
	}

}
