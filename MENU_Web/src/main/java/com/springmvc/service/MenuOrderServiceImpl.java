package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.modle.service.BaseServiceImpl;
import com.springmvc.entity.MenuOrder;

/**
 * 點餐資料的Service實做
 * 
 * @author hrne
 *
 */
@Service("memuOrderService")
public class MenuOrderServiceImpl extends BaseServiceImpl<MenuOrder> implements MenuOrderService {
    

}
