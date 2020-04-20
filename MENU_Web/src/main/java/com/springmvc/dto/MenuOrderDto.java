package com.springmvc.dto;

/**
 * 點餐資料Dto
 * 
 * @author hrne
 *
 */
public class MenuOrderDto {

	/**
	 * 菜單項目ID
	 */
	private int menuItemID;

	/**
	 * 菜單項目名稱
	 */
	private String menuItemName;

	/**
	 * 點餐數量
	 */
	private int orderNum;
	
	/**
	 * 單價
	 */
	private int price;

	/**
	 * 備註
	 */
	private String remark;

	/**
	 * 菜單項目ID
	 */
	public int getMenuItemID() {
		return menuItemID;
	}

	public void setMenuItemID(int menuItemID) {
		this.menuItemID = menuItemID;
	}

	/**
	 * 菜單項目名稱
	 */
	public String getMenuItemName() {
		return menuItemName;
	}

	public void setMenuItemName(String menuItemName) {
		this.menuItemName = menuItemName;
	}

	/**
	 * 點餐數量
	 */
	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	/**
	 * 備註
	 */
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 單價
	 */
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


}
