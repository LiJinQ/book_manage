package com.ambow.dao;

import java.util.List;

import com.ambow.pojo.Menu;

public interface MenuDao {
	public List<Menu> getMenuByRoleId(int roleId);
}
