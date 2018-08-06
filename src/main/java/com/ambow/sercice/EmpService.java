package com.ambow.sercice;

import java.util.List;

import com.ambow.pojo.Emp;
import com.ambow.vo.Pager;

public interface EmpService {
	public boolean login(Emp emp);
	public int newEmp(Emp emp);
	public int updateEmp(Emp emp);	
	public int deleteEmpById(int id);
	public Emp getEmpById(int id);	
	public List<Emp> getAllEmp();
	public Emp getEmpByUsername(String username);
	public Pager<Emp> getEmpPager(int pageNum);
	public Pager<Emp> getEmpFindPager(int pageNum,String sth);
}
