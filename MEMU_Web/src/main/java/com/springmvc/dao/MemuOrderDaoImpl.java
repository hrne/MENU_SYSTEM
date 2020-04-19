package com.springmvc.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.modle.dao.BaseDaoImpl;
import com.springmvc.entity.MemuOrder;

/**
 * 點餐資料的Dao實做
 * 
 * @author hrne
 *
 */
@Repository
public class MemuOrderDaoImpl extends BaseDaoImpl<MemuOrder> implements MemuOrderDao {

	@Autowired
	private SessionFactory sessionFactory;

	public MemuOrderDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}
	

}