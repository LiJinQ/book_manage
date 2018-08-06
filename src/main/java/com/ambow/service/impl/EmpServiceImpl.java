package com.ambow.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambow.dao.EmpDao;
import com.ambow.pojo.Emp;
import com.ambow.sercice.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpDao ed;
	@Override
	public boolean login(Emp emp) {
		// TODO Auto-generated method stub
		Emp e1 = getEmpByUsername(emp.getUsername());
		if(e1==null) {
			return false;
		}
		if(e1.getPassword().equals(emp.getPassword())) {
			return true;
		}
		return false;
	}

	@Override
	public void newEmp(Emp emp) {
		// TODO Auto-generated method stub
		ed.newEmp(emp);
	}

	@Override
	public void updateEmp(Emp emp) {
		// TODO Auto-generated method stub
		ed.updateEmp(emp);
	}

	@Override
	public Emp getEmpById(int id) {
		// TODO Auto-generated method stub
		return ed.getEmpByIdOrUsername(id, null);
	}

	@Override
	public List<Emp> getAllEmp() {
		// TODO Auto-generated method stub
		return ed.getEmp(null, 0, null);
	}

	@Override
	public Emp getEmpByUsername(String username) {
		// TODO Auto-generated method stub
		return ed.getEmpByIdOrUsername(0, username);
	}

}
