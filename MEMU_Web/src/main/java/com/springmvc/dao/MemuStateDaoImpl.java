package com.springmvc.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.modle.dao.BaseDaoImpl;
import com.springmvc.entity.MemuState;

/**
 * 菜單狀態的Dao實做
 * 
 * @author hrne
 *
 */
@Repository
public class MemuStateDaoImpl extends BaseDaoImpl<MemuState> implements MemuStateDao {

	@Autowired
	private SessionFactory sessionFactory;

	public MemuStateDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}