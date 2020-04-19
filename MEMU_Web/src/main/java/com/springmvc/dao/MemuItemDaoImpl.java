package com.springmvc.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.modle.dao.BaseDaoImpl;
import com.springmvc.entity.MemuItem;

/**
 * 菜單選項資料的Dao實做
 * 
 * @author hrne
 *
 */
@Repository
public class MemuItemDaoImpl extends BaseDaoImpl<MemuItem> implements MemuItemDao {

	@Autowired
	private SessionFactory sessionFactory;

	public MemuItemDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}


}