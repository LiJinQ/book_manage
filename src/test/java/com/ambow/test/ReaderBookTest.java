package com.ambow.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ambow.dao.ReaderBookDao;
import com.ambow.pojo.ReaderBook;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-db.xml","classpath:spring-mvc.xml","classpath:spring.xml"})
public class ReaderBookTest {

	@Autowired
	ReaderBookDao readerbookdao;
	
	@Test
	public void testnewReaderBook() {
		readerbookdao.newReaderBook(new ReaderBook(2,2,2,new Date(),new Date(),(float)1.0));
	}
	
	@Test
	public void updateReaderBook() {
		readerbookdao.updateReaderBook(new ReaderBook(2,3,3,new Date(),new Date(),(float)1.0));
	}
	
	@Test
	public void getReaderBookByReaderId() {
		System.out.println(readerbookdao.getReaderBookByReaderId(3));
	}
	
	@Test
	public void getAllReaderBook() {
		System.out.println(readerbookdao.getAllReaderBook());
	}
	
	@Test
	public void getReaderBookById() {
		System.out.println(readerbookdao.getReaderBookById(1));
	}
	@Test
	public void getNow() {
		System.out.println(readerbookdao.getNow());
	}
}
