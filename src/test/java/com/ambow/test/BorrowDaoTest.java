package com.ambow.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ambow.dao.BorrowDao;
import com.ambow.pojo.Borrow;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-db.xml","classpath:spring-mvc.xml","classpath:spring.xml"})
public class BorrowDaoTest {

	@Autowired
	private BorrowDao bd;

	@Test
	public void testNew() {
		Borrow borrow = new Borrow(0, 0, 0, 0, 0, false, null, null, false, null, 0, 0);
		bd.newBorrow(borrow);
	}
	
	@Test
	public void testSelectById() {
		System.out.println(bd.getBorrowById(1));
	}
	
	
	@Test
	public void testSelectAll() {
		System.out.println(bd.getAllBorrow());
	}
	
	@Test
	public void testUpdate() {
		Borrow borrow = new Borrow(1, 0, 0, 0, 0, false, null, null, false, null, 0, 0);
		bd.updateBorrow(borrow);
	}

}
