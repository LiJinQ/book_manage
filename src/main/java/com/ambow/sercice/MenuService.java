package com.ambow.sercice;

import java.util.List;

import com.ambow.pojo.Menu;

public interface MenuService {
	public List<Menu> getMenuByRoleId(int roleId);
}
