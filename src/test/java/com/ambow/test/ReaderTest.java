package com.ambow.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ambow.dao.ReaderDao;
import com.ambow.pojo.Reader;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-db.xml","classpath:spring-mvc.xml","classpath:spring.xml"})
public class ReaderTest {

	@Autowired
	ReaderDao readerdao;
	
	@Test
	public void newReader() {
		readerdao.newReader(new Reader(3,"3","3","3",new Date(),"3","3","3"));
	}
	@Test
	public void updateReader() {
		readerdao.updateReader(new Reader(4,"2","2","2",new Date(),"3","3","3"));
	}
	@Test
	public void deleteReaderById() {
		readerdao.deleteReaderById(4);
	}
	@Test
	public void getReaderById() {
		System.out.println(readerdao.getReaderById(1));
	}
	
	@Test
	public void getReaderByName() {
		System.out.println(readerdao.getReaderByName("%Âí%"));
	}
	@Test
	public void getAllReader() {
		System.out.println(readerdao.getAllReader());
	}
}
