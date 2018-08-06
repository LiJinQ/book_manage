package com.ambow.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ambow.dao.EmpDao;
import com.ambow.pojo.Emp;
import com.ambow.vo.Pager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-db.xml","classpath:spring-mvc.xml","classpath:spring.xml"})
public class EmpTest {

	@Autowired
	private EmpDao ed;

	@Test
	public void test() {
		for(int i=0;i<30;i++) {
			Emp emp = new Emp(0, "numberTest"+i, "username"+i, "123456", "nameTest"+1, 1, "男", new Date(), "telTest"+i, "address"+i);
			ed.newEmp(emp);
		}
	}
	
	@Test
	public void testPager() {
		int totalRecord = ed.getTotalRecord();
		Pager<Emp> pager = new Pager<>( 1, 5, totalRecord);
		System.out.println(pager);
		pager.setList(ed.getEmpFind(pager, "%t%"));
		for(Emp e:pager.getList()) {
			System.out.println(e);
		}
	}

}
