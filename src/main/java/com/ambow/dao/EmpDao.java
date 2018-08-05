package com.ambow.dao;

import java.util.Date;
import java.util.List;

import com.ambow.pojo.Emp;

public interface EmpDao {
	
	/**
	 * ע��Ա��������Ϣ
	 * @param emp
	 */
	public void newEmp(Emp emp);
	
	/**
	 * �޸�Ա����Ϣ
	 * @param emp
	 */
	public void updateEmp(Emp emp);
	
	/**
	 * ɾ��Ա����Ϣ
	 * @param id
	 */
	public void deleteEmpById(int id);
	
	/**
	 * ����id�����û������в�ѯ
	 * @param id
	 * @param username
	 * @return
	 */
	
	public Emp getEmpByIdOrUserName(int id,String username);
	
	/**
	 * �鿴Ա����Ϣ������Ա��������Ա�����͡���ְʱ��ɸѡԱ����Ϣ
	 * @param name
	 * @param roleId
	 * @param entryTime
	 * @return
	 */
	public List<Emp> getEmp(String name,int roleId,Date entryTime);
}
