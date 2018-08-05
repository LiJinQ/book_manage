package com.ambow.dao;

import java.util.List;

import com.ambow.pojo.Role;

public interface RoleDao {
	public List<Role> getAllRole();
	public Role getRoleById(int id);
	public int newRole(Role role);
	public int deleteRole(int id);
	public int updateRole(Role role);
}
