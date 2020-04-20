package com.springmvc.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.modle.dao.BaseDaoImpl;
import com.springmvc.entity.MenuOrder;

/**
 * 點餐資料的Dao實做
 * 
 * @author hrne
 *
 */
@Repository
public class MenuOrderDaoImpl extends BaseDaoImpl<MenuOrder> implements MenuOrderDao {

	@Autowired
	private SessionFactory sessionFactory;

	public MenuOrderDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}
	

}