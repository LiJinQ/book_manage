package com.ambow.dao;

import java.util.List;

import com.ambow.pojo.RoleMenu;

public interface RoleMenuDao {
	
	public List<RoleMenu> getAllRoleMenu();
	public RoleMenu getRoleMenuById(int id);
	
	public int newRoleMenu(RoleMenu rolemenu);
	public int deleteRoleMenu(int id);
	public int updateRoleMenu(RoleMenu rolemenu);
}
