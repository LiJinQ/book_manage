package com.ambow.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambow.dao.MenuDao;
import com.ambow.pojo.Menu;
import com.ambow.sercice.MenuService;

@Service
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	private MenuDao md;

	@Override
	public List<Menu> getMenuByRoleId(int roleId) {
		// TODO Auto-generated method stub
		return md.getMenuByRoleId(roleId);
	}

}
