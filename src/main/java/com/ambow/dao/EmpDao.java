package com.ambow.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

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
	
	public Emp getEmpByIdOrUsername(@Param("id")int id,@Param("username")String username);
	
	/**
	 * �鿴Ա����Ϣ������Ա��������Ա�����͡���ְʱ��ɸѡԱ����Ϣ
	 * @param name
	 * @param roleId
	 * @param entryTime
	 * @return
	 */
	public List<Emp> getEmp(@Param("name")String name,@Param("roleId")int roleId,@Param("entryTime")Date entryTime);
}
