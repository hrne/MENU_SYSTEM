package com.springmvc.service;

import org.springframework.stereotype.Service;
import com.modle.service.BaseServiceImpl;
import com.springmvc.entity.MenuItem;

/**
 * 菜單選項資料的Service實做
 * 
 * @author hrne
 *
 */
@Service("memuItemService")
public class MenuItemServiceImpl extends BaseServiceImpl<MenuItem> implements MenuItemService {
	

}
