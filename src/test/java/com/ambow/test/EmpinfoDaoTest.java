package com.ambow.test;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ambow.dao.EmpinfoDao;
import com.ambow.pojo.Empinfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-db.xml","classpath:spring-mvc.xml","classpath:spring.xml"})
public class EmpinfoDaoTest {

	@Resource
	private EmpinfoDao ed;

	@Test
	public void testNew() {
		Empinfo empinfo = new Empinfo(0, "suadmin", "ljq", "男", null, "15141111111", "苏州市昆山市安博产业园", "无", 1, "123456");
		ed.newEmpInfo(empinfo);
	}
	
	@Test
	public void testSelectById() {
		int empid = 1;
		System.out.println(ed.getEmpinfoById(empid));
	}
	
	@Test
	public void testSelectByLoginName() {
		String loginName = "admin";
		System.out.println(ed.getEmpinfoByLoginName(loginName));
	}
	
	@Test
	public void testSelectAll() {
		System.out.println(ed.getAllEmpinfo());
	}
	
	@Test
	public void testUpdate() {
		Empinfo empinfo = new Empinfo(1, "suadmin1", "ljq", "男", null, "15141111111", "苏州市昆山市安博产业园", "无", 1, "123456");
		ed.updateEmpInfo(empinfo);
	}
}
