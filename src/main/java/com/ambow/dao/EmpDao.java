package com.ambow.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ambow.pojo.Emp;

public interface EmpDao {
	
	/**
	 * 注册员工基本信息
	 * @param emp
	 */
	public void newEmp(Emp emp);
	
	/**
	 * 修改员工信息
	 * @param emp
	 */
	public void updateEmp(Emp emp);
	
	/**
	 * 删除员工信息
	 * @param id
	 */
	public void deleteEmpById(int id);
	
	/**
	 * 根据id或者用户名进行查询
	 * @param id
	 * @param username
	 * @return
	 */
	
	public Emp getEmpByIdOrUsername(@Param("id")int id,@Param("username")String username);
	
	/**
	 * 查看员工信息；根据员工姓名、员工类型、入职时间筛选员工信息
	 * @param name
	 * @param roleId
	 * @param entryTime
	 * @return
	 */
	public List<Emp> getEmp(@Param("name")String name,@Param("roleId")int roleId,@Param("entryTime")Date entryTime);
}
