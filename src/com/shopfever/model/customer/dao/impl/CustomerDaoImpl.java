package com.shopfever.model.customer.dao.impl;

import java.util.ArrayList;
import java.util.List;

 
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shopfever.model.customer.dao.CustomerDao;
 
import com.shopfever.model.hbm.SfCustomer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	

	@Autowired
	private  SessionFactory sessionFactory ;
  
	 
	 
 
	public boolean addNewUser(SfCustomer sfCustomer) throws Exception
	{
	 
		
		Boolean addFlag = false;
		try{
	 	Session session = this.sessionFactory.getCurrentSession();
	 
			session.save(sfCustomer);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
 
		return addFlag;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<SfCustomer> getallCustomers() throws Exception
	{
 
		ArrayList<SfCustomer> customerList = null;
		Session session = this.sessionFactory.getCurrentSession();
		
		Criteria criteria = session.createCriteria(SfCustomer.class);
		customerList = (ArrayList<SfCustomer>)criteria.list();
	 
		return customerList;
	}

}
