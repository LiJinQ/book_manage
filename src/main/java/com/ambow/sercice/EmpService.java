package com.ambow.sercice;

import java.util.List;

import com.ambow.pojo.Emp;

public interface EmpService {
	public boolean login(Emp emp);
	public void newEmp(Emp emp);
	public void updateEmp(Emp emp);
	public Emp getEmpById(int id);	
	public List<Emp> getAllEmp();
	public Emp getEmpByUsername(String username);
}
