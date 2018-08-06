package com.ambow.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ambow.pojo.Emp;
import com.ambow.sercice.EmpService;
import com.ambow.vo.Pager;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpService es;
	
	@RequestMapping(value="login.do",method = RequestMethod.POST)
	@ResponseBody
	public Emp login(@RequestBody Emp emp, HttpSession session) {
		if(es.login(emp)) {
			session.setAttribute("emp", emp);
			return es.getEmpByUsername(emp.getUsername());
		}
		return null;
	}
	
	@RequestMapping(value="newEmp.do",method = RequestMethod.POST)
	@ResponseBody
	public int newEmp(@RequestBody Emp emp) {
		return es.newEmp(emp);
	}
	
	@RequestMapping(value="deleteEmp.do",method = RequestMethod.POST)
	@ResponseBody
	public int deleteEmp(@RequestBody int id) {
		return es.deleteEmpById(id);
	}
	
	@RequestMapping(value="updateEmp.do",method = RequestMethod.POST)
	@ResponseBody
	public int updateEmp(@RequestBody Emp emp) {
		return es.updateEmp(emp);
	}
	
	@RequestMapping(value="getEmpPager.do",method = RequestMethod.POST)
	@ResponseBody
	public Pager<Emp> getEmpPager(@RequestBody int pageNum){
		return es.getEmpPager(pageNum);
	}
	
	@RequestMapping(value="getEmpFindPager.do",method = RequestMethod.POST)
	@ResponseBody
	public Pager<Emp> getEmpPager(@RequestBody int pageNum,@RequestBody String sth){
		return es.getEmpFindPager(pageNum, sth);
	}
	
	@RequestMapping("/session.do")
	@ResponseBody
	public Emp getSession(HttpSession session) {
		if(session.getAttribute("emp")==null) {
			return null;
		}else{
			return (Emp) session.getAttribute("emp");
		}
	}
	
}
