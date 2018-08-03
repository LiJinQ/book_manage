package com.ambow.pojo;

public class Menu {
    private int menuId;

    private int menuNo;

    private int menuParentNo;

    private String menuName;

    private String menuUrl;

    private int menuLevel;

    private String state;

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Menu(int menuId, int menuNo, int menuParentNo, String menuName, String menuUrl, int menuLevel,
			String state) {
		super();
		this.menuId = menuId;
		this.menuNo = menuNo;
		this.menuParentNo = menuParentNo;
		this.menuName = menuName;
		this.menuUrl = menuUrl;
		this.menuLevel = menuLevel;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuNo=" + menuNo + ", menuParentNo=" + menuParentNo + ", menuName="
				+ menuName + ", menuUrl=" + menuUrl + ", menuLevel=" + menuLevel + ", state=" + state + "]";
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

	public int getMenuParentNo() {
		return menuParentNo;
	}

	public void setMenuParentNo(int menuParentNo) {
		this.menuParentNo = menuParentNo;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
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