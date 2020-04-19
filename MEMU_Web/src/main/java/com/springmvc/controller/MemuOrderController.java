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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.modle.util.ObjectMapperUtils;
import com.springmvc.dto.MemuOrderDto;
import com.springmvc.dto.SenMachDto;
import com.springmvc.entity.MemuItem;
import com.springmvc.entity.SenMach;
import com.springmvc.entity.SenMod;
import com.springmvc.service.MemuItemService;
import com.springmvc.service.SenMachService;
import com.springmvc.service.SenModService;
import com.springmvc.validator.SenMachFormValidator;

@Controller
public class MemuOrderController {

	@Autowired
	SenMachFormValidator senMachFormValidator;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(senMachFormValidator);
	}

	@Autowired
	private MemuItemService memuItemService;

	@Autowired
	private ResourceBundleMessageSource messageSource;

	/**
	 * 進入點餐頁面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/memuOrder/list", method = RequestMethod.GET)
	public String showAllMemu(Model model) {

		// 查詢所有菜單
		List<MemuItem> listMemuItem = memuItemService.findAll();

		List<MemuOrderDto> listMemuOrderDto = new ArrayList<MemuOrderDto>();

		for (MemuItem bo : listMemuItem) {
			MemuOrderDto dto = new MemuOrderDto();
			dto.setOrderNum(0);
			dto.setMemuItemID(bo.getId());
			dto.setMemuItemName(bo.getItemName());
			listMemuOrderDto.add(dto);
		}
		createFormOptions(model);
		model.addAttribute("listMemuOrderDto", listMemuOrderDto);

		int tableNum = 0;
		model.addAttribute("tableNum", tableNum);
		return "memuOrder/memuOrderForm";
	}

//	/**
//	 * 新增感應器
//	 * 
//	 * @param model
//	 * @return
//	 */
//	@RequestMapping(value = "/senMach/add", method = RequestMethod.GET)
//	public String showAddUserForm(Model model) {
//		SenMachDto senMachDto = new SenMachDto();
//		model.addAttribute("senMachDto", senMachDto);
//		createFormOptions(model);
//		return "senMach/senMachForm";
//	}
//
//	/**
//	 * 修改感應器
//	 * 
//	 * @param id
//	 * @param model
//	 * @return
//	 */
//	@RequestMapping(value = "/senMach/{id}/update", method = RequestMethod.GET)
//	public String showUpdateSenMachForm(@PathVariable("id") int id, Model model) {
//
//		// 查詢感應器資料
//		SenMach senMach = senMachService.findByPK(id);
//
//		// 將感應器map到dto上
//		SenMachDto senMachDto = ObjectMapperUtils.map(senMach, SenMachDto.class);
//
//		List<Integer> senModIDs = new ArrayList<Integer>();
//
//		// 將現有的感應裝置放入顯示
//		for (SenMod senMod : senMach.getSenModSet()) {
//			senModIDs.add(senMod.getId());
//		}
//		senMachDto.setSenModsID(senModIDs);
//		model.addAttribute("senMachDto", senMachDto);
//
//		createFormOptions(model);
//		return "senMach/senMachForm";
//	}
//
	/**
	 * 儲存感應器 from add or update
	 * 
	 * @param user
	 * @param result
	 * @param model
	 * @param redirectAttributes
	 * @return
	 */

	@RequestMapping(value = "/memuOrder/send", method = RequestMethod.GET)
	public String sendMenu(Model model) {
		model.
		
		return "redirect:/memuOrder/list";
	}

	/**
	 * 產生頁面資訊
	 * 
	 * @param model
	 */
	private void createFormOptions(Model model) {

		List<Integer> numList = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			numList.add(i);
		}
		model.addAttribute("numList", numList);

	}

}