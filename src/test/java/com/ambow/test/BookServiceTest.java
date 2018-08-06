package com.ambow.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ambow.sercice.BookService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-db.xml","classpath:spring-mvc.xml","classpath:spring.xml"})
public class BookServiceTest {
	@Autowired
	private BookService bs;

	@Test
	public void testNewBook() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateBook() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteBookById() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBookById() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllBook() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBookByTypeId() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBookByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBookBySearch() {
		System.out.println(bs.getBookBySearch("201"));
	}

}
