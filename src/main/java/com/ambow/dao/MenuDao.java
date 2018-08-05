package com.ambow.dao;

import java.util.List;

import com.ambow.pojo.Menu;

public interface MenuDao {
	public Menu getMenuById(int menuid);
	public List<Menu> getAllMenu();
	public int newMenu(Menu menu);
	public int deleteMenu(int menuid);
	public int updateMenu(Menu menu);
	
}
