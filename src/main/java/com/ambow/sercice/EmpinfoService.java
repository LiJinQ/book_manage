package com.ambow.sercice;

import com.ambow.pojo.Empinfo;

public interface EmpinfoService {
	/**
	 * 从Controller接受一个empinfo实体，验证登陆功能。
	 * @param empinfo
	 * @return
	 * 登陆成功：true
	 * 失败：false
	 */
	public boolean login(Empinfo empinfo);
	/**
	 * 新增员工信息
	 * @param empinfo
	 */
	public void newEmpinfo(Empinfo empinfo);
	/**
	 * 修改员工信息
	 * @param empinfo
	 */
	public void updateEmpinfo(Empinfo empinfo);
	/**
	 * 通过empid删除员工信息
	 * @param id
	 */
	public void deleteEmpinfoById(int empid);
	/**
	 * 通过empid获得一个员工实体
	 * @param empid
	 * @return
	 */
	public Empinfo getEmpinfoById(int empid);
}
