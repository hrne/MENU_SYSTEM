package com.springmvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.modle.util.ObjectMapperUtils;
import com.springmvc.dto.MenuOrderDto;
import com.springmvc.dto.MenuOrderForm;
import com.springmvc.entity.MenuItem;
import com.springmvc.entity.MenuOrder;
import com.springmvc.entity.MenuState;
import com.springmvc.service.MenuItemService;
import com.springmvc.service.MenuOrderService;
import com.springmvc.service.MenuStateService;

@Controller
public class MenuOrderController {

//	@Autowired
//	SenMachFormValidator senMachFormValidator;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		// binder.setValidator(senMachFormValidator);
	}

	@Autowired
	private MenuItemService menuItemService;
	
	@Autowired
	private MenuStateService menuStateService;
	
	@Autowired
	private MenuOrderService menuOrderService;

	@Autowired
	private ResourceBundleMessageSource messageSource;

	/**
	 * 進入點餐頁面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/menuOrder/listMenuOrder", method = RequestMethod.GET)
	public ModelAndView showAllMemu() {

		// 查詢所有菜單
		List<MenuItem> listMenuItem = menuItemService.findAll();

		List<MenuOrderDto> listMenuOrderDto = new ArrayList<MenuOrderDto>();

		for (MenuItem bo : listMenuItem) {
			MenuOrderDto dto = new MenuOrderDto();
			dto.setOrderNum(0);
			dto.setMenuItemID(bo.getId());
			dto.setMenuItemName(bo.getItemName());
			dto.setPrice(bo.getPrice());
			listMenuOrderDto.add(dto);
		}

		MenuOrderForm menuOrderForm = new MenuOrderForm();
		menuOrderForm.setListMenuOrderDto(listMenuOrderDto);
		return new ModelAndView("menuOrder/listMenuOrder", "menuOrderForm", menuOrderForm);
	}

	@RequestMapping(value = "/menuOrder/send", method = RequestMethod.POST)
	public ModelAndView send(@ModelAttribute("menuOrderForm") MenuOrderForm menuOrderForm) {
		System.out.println("sucess!!");
		for (MenuOrderDto dto : menuOrderForm.getListMenuOrderDto()) {
			System.out.println(dto.getOrderNum());
			if(dto.getOrderNum()>0) {
				MenuOrder saveBo = new MenuOrder();
				MenuItem bo = menuItemService.findByPK(dto.getMenuItemID());
				MenuState menuState = menuStateService.findByPK(1);
				saveBo.setMenuItem(bo);
				saveBo.setMenuState(menuState);
				saveBo.setOrderNum(dto.getOrderNum());
				saveBo.setTablenNum(menuOrderForm.getTableNum());
				saveBo.setRemark(dto.getRemark());
				menuOrderService.saveOrUpdate(saveBo);
			}
		}

		// 查詢所有菜單
		List<MenuItem> listMenuItem = menuItemService.findAll();

		List<MenuOrderDto> listMenuOrderDto = new ArrayList<MenuOrderDto>();

		for (MenuItem bo : listMenuItem) {
			MenuOrderDto dto = new MenuOrderDto();
			dto.setOrderNum(0);
			dto.setMenuItemID(bo.getId());
			dto.setMenuItemName(bo.getItemName());
			dto.setPrice(bo.getPrice());
			listMenuOrderDto.add(dto);
		}

		menuOrderForm = new MenuOrderForm();
		menuOrderForm.setListMenuOrderDto(listMenuOrderDto);
		return new ModelAndView("menuOrder/listMenuOrder", "menuOrderForm", menuOrderForm);
	}
//	/**
//	 * 產生頁面資訊
//	 * 
//	 * @param model
//	 */
//	private void createFormOptions(Model model) {
//
//		List<Integer> numList = new ArrayList<Integer>();
//		for (int i = 0; i <= 10; i++) {
//			numList.add(i);
//		}
//		model.addAttribute("numList", numList);
//
//	}

}