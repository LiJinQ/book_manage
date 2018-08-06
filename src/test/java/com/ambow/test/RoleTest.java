package com.ambow.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ambow.dao.RoleDao;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-db.xml","classpath:spring-mvc.xml","classpath:spring.xml"})
public class RoleTest {
	
	@Autowired
	private RoleDao roledao;
	
	@Test
	public void testgetRoleById() {
		System.out.println(roledao.getRoleById(2));
	}

}
