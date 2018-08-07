package com.ambow.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ambow.pojo.Emp;
import com.ambow.vo.Pager;

public interface EmpDao {
	
	public int newEmp(Emp emp);
	
	/**
	 * �޸�Ա����Ϣ
	 * @param emp
	 */
	public int updateEmp(Emp emp);
	
	/**
	 * ɾ��Ա����Ϣ
	 * @param id
	 */
	public int deleteEmpById(int id);
	
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

	public int getTotalRecord();
	public int getFindTotalRecord(String sth);
	public List<Emp> getEmpPager(Pager<Emp> pager);
	
	public List<Emp> getEmpFind(@Param("pager")Pager<Emp> pager,@Param("sth")String sth);
}
