package com.ambow.pojo;

public class RoleMenu {
	private int id;
	private int roleId;
	private int menuId;
	public RoleMenu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RoleMenu(int id, int roleId, int menuId) {
		super();
		this.id = id;
		this.roleId = roleId;
		this.menuId = menuId;
	}
	@Override
	public String toString() {
		return "RoleMenu [id=" + id + ", roleId=" + roleId + ", menuId=" + menuId + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
}
