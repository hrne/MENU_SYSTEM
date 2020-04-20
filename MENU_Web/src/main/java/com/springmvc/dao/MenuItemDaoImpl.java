package com.springmvc.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.modle.dao.BaseDaoImpl;
import com.springmvc.entity.MenuItem;

/**
 * 菜單選項資料的Dao實做
 * 
 * @author hrne
 *
 */
@Repository
public class MenuItemDaoImpl extends BaseDaoImpl<MenuItem> implements MenuItemDao {

	@Autowired
	private SessionFactory sessionFactory;

	public MenuItemDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}


}