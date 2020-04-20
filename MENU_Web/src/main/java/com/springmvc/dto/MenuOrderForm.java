package com.springmvc.dto;

import java.util.ArrayList;
import java.util.List;

public class MenuOrderForm {

	private List<MenuOrderDto> listMenuOrderDto = new ArrayList<MenuOrderDto>();

	private List<Integer> numList = new ArrayList<Integer>();

	private int tableNum = 0;

	public List<MenuOrderDto> getListMenuOrderDto() {
		return listMenuOrderDto;
	}

	public void setListMenuOrderDto(List<MenuOrderDto> listMenuOrderDto) {
		this.listMenuOrderDto = listMenuOrderDto;
	}

	public List<Integer> getNumList() {
		numList = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			numList.add(i);
		}
		return numList;
	}

	public void setNumList(List<Integer> numList) {
		this.numList = numList;
	}

	public int getTableNum() {
		return tableNum;
	}

	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}

}
