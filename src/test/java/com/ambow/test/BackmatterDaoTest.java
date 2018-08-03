package com.ambow.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ambow.dao.BackmatterDao;
import com.ambow.pojo.Backmatter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-db.xml","classpath:spring-mvc.xml","classpath:spring.xml"})
public class BackmatterDaoTest {

	@Autowired
	private BackmatterDao bd;

	@Test
	public void testNew() {
		Backmatter backmatter = new Backmatter(0, "a", "aa", 1);
		bd.newBackmatter(backmatter);
	}
	
	@Test
	public void testSelectById() {
		System.out.println(bd.getBackmatterById(1));
	}
	
	
	@Test
	public void testSelectAll() {
		System.out.println(bd.getAllBackmatter());
	}
	
	@Test
	public void testUpdate() {
		Backmatter backmatter = new Backmatter(1, "b", "aa", 1);
		bd.updateBackmatter(backmatter);
	}

}
