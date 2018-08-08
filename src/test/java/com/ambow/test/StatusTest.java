package com.ambow.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ambow.dao.StatusDao;
import com.ambow.pojo.Status;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-db.xml","classpath:spring-mvc.xml","classpath:spring.xml"})
public class StatusTest {
	
	@Autowired
	StatusDao statusdao;
	
	@Test
	public void testupdateStatus() {
		statusdao.newStatus(new Status(2,2,2,2,2,new Date()));
	}
	
	@Test
	public void testgetStatusByEbbId() {
		System.out.println(statusdao.getStatusByEbbId(2));
	}
	
	
}
