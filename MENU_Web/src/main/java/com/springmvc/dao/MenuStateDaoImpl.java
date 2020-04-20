package com.springmvc.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.modle.dao.BaseDaoImpl;
import com.springmvc.entity.MenuState;

/**
 * 菜單狀態的Dao實做
 * 
 * @author hrne
 *
 */
@Repository
public class MenuStateDaoImpl extends BaseDaoImpl<MenuState> implements MenuStateDao {

	@Autowired
	private SessionFactory sessionFactory;

	public MenuStateDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}