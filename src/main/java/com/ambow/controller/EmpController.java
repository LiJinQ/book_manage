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
import com.ambow.vo.PagerVo;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpService es;
	
	@RequestMapping(value="login.do",method = RequestMethod.POST)
	@ResponseBody
	public Emp login(@RequestBody Emp emp, HttpSession session) {
		if(es.login(emp)) {
			session.setAttribute("emp", es.getEmpByUsername(emp.getUsername()));
			return (Emp) session.getAttribute("emp");
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
	public Pager<Emp> getEmpPager(@RequestBody PagerVo pv){
		return es.getEmpPager(pv.getPageNum());
	}
	
	@RequestMapping(value="getEmpFindPager.do",method = RequestMethod.POST)
	@ResponseBody
	public Pager<Emp> getEmpFindPager(@RequestBody PagerVo pv){
		return es.getEmpFindPager(pv.getPageNum(), pv.getContent());
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
	
	@RequestMapping("/loginout.do")
	public void LoginOut(HttpSession session) {
		session.removeAttribute("emp");
	}
}
