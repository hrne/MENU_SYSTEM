package com.springmvc.dto;

/**
 * 點餐資料Dto
 * 
 * @author hrne
 *
 */
public class MemuOrderDto {

	/**
	 * 菜單項目ID
	 */
	private int memuItemID;

	/**
	 * 菜單項目名稱
	 */
	private String memuItemName;

	/**
	 * 點餐數量
	 */
	private int orderNum = 0;

	/**
	 * 備註
	 */
	private String remark;

	/**
	 * 菜單項目ID
	 */
	public int getMemuItemID() {
		return memuItemID;
	}

	public void setMemuItemID(int memuItemID) {
		this.memuItemID = memuItemID;
	}

	/**
	 * 菜單項目名稱
	 */
	public String getMemuItemName() {
		return memuItemName;
	}

	public void setMemuItemName(String memuItemName) {
		this.memuItemName = memuItemName;
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

}
