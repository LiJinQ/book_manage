package com.ambow.pojo;

public class RoleMenu {
    private int roleMenuId;

    private int roleId;

    private int menuId;

    private int menuNo;

    private int menuLevel;

    private String state;

	public RoleMenu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoleMenu(int roleMenuId, int roleId, int menuId, int menuNo, int menuLevel, String state) {
		super();
		this.roleMenuId = roleMenuId;
		this.roleId = roleId;
		this.menuId = menuId;
		this.menuNo = menuNo;
		this.menuLevel = menuLevel;
		this.state = state;
	}

	@Override
	public String toString() {
		return "RoleMenu [roleMenuId=" + roleMenuId + ", roleId=" + roleId + ", menuId=" + menuId + ", menuNo=" + menuNo
				+ ", menuLevel=" + menuLevel + ", state=" + state + "]";
	}

	public int getRoleMenuId() {
		return roleMenuId;
	}

	public void setRoleMenuId(int roleMenuId) {
		this.roleMenuId = roleMenuId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public int getMenuNo() {
		return menuNo;
	}

	public void setMenuNo(int menuNo) {
		this.menuNo = menuNo;
	}

	public int getMenuLevel() {
		return menuLevel;
	}

	public void setMenuLevel(int menuLevel) {
		this.menuLevel = menuLevel;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

    
}