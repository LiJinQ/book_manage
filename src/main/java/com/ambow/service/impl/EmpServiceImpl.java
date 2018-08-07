package com.ambow.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambow.dao.EmpDao;
import com.ambow.pojo.Emp;
import com.ambow.sercice.EmpService;
import com.ambow.vo.Pager;

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
	public int newEmp(Emp emp) {
		// TODO Auto-generated method stub
		return ed.newEmp(emp);
	}

	@Override
	public int updateEmp(Emp emp) {
		// TODO Auto-generated method stub
		return ed.updateEmp(emp);
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

	@Override
	public Pager<Emp> getEmpPager(int pageNum) {
		// TODO Auto-generated method stub
		int totalRecord = ed.getTotalRecord();
		Pager<Emp> pager = new Pager<Emp>(pageNum, 10, totalRecord);
		pager.setList(ed.getEmpPager(pager));
		return pager;
	}

	@Override
	public int deleteEmpById(int id) {
		// TODO Auto-generated method stub
		return ed.deleteEmpById(id);
	}

	@Override
	public Pager<Emp> getEmpFindPager(int pageNum, String sth) {
		// TODO Auto-generated method stub
		int totalRecord = ed.getFindTotalRecord(sth);
		sth = "%"+sth+"%";
		Pager<Emp> pager = new Pager<Emp>(pageNum, 10, totalRecord);
		pager.setList(ed.getEmpFind(pager, sth));
		return pager;
	}

}
