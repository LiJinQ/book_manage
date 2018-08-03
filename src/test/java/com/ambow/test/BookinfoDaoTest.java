package com.ambow.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ambow.dao.BookinfoDao;
import com.ambow.pojo.Bookinfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-db.xml","classpath:spring-mvc.xml","classpath:spring.xml"})
public class BookinfoDaoTest {

	@Autowired
	private BookinfoDao bd;

	@Test
	public void testNew() {
		Bookinfo bookinfo = new Bookinfo(0, 1, "a", "aa", "bb", null, "aa", 1, false, null, 1, 0);
		bd.newBookinfo(bookinfo);
	}
	
	@Test
	public void testSelectById() {
		System.out.println(bd.getBookinfoById(1));
	}
	
	
	@Test
	public void testSelectAll() {
		System.out.println(bd.getAllBookinfo());
	}
	
	@Test
	public void testUpdate() {
		Bookinfo bookinfo = new Bookinfo(1, 1, "aa", "aa", "bb", null, "aa", 1, false, null, 1, 0);
		bd.updateBookinfo(bookinfo);
	}

}
