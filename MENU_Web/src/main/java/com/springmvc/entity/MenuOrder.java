package com.springmvc.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 點餐資料
 * 
 * @author hrne
 *
 */
@Entity
@Table(name = "Menu_Order")
public class MenuOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    /**
     * 桌號
     */
    @Column(name = "table_num")
    private int tablenNum;
    
	/**
	 * 菜單項目
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "menu_item_id")
    private MenuItem menuItem;
    
    /**
     * 點餐數量
     */
    @Column(name = "order_num")
    private int orderNum;
    
    /**
     * 備註
     */
    @Column(name = "remark")
    private String remark;
    
	/**
	 * 菜單狀態
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "menu_state_id")
    private MenuState menuState;
	
    /**
     * 更新時間，透過SQL自動產生
     */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_date",insertable = false, updatable = false)
    private Date updateDate;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
    /**
     * 桌號
     */
	public int getTablenNum() {
		return tablenNum;
	}

	public void setTablenNum(int tablenNum) {
		this.tablenNum = tablenNum;
	}

	/**
	 * 菜單項目
	 */
	public MenuItem getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
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
	 * 菜單狀態
	 */
	public MenuState getMenuState() {
		return menuState;
	}

	public void setMenuState(MenuState menuState) {
		this.menuState = menuState;
	}

	/**
     * 更新時間，透過SQL自動產生
     */
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
}