package com.ambow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ambow.pojo.Emp;
import com.ambow.sercice.EmpService;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpService es;
	
	@RequestMapping(value="login.do",method = RequestMethod.POST)
	@ResponseBody
	public Emp login(@RequestBody Emp emp) {
		if(es.login(emp)) {
			return es.getEmpByUsername(emp.getUsername());
		}
		return null;
	}
}
