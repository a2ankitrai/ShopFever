package com.shopfever.model.login.dao.daoImpl;

import java.util.List;

 


import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shopfever.model.common.beans.ServiceResult;
import com.shopfever.model.hbm.SfCustomer;
import com.shopfever.model.login.dao.LoginDao;

@Repository
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	private  SessionFactory sessionFactory ;
	
	static final Logger logger = Logger.getLogger(LoginDaoImpl.class); 

	@SuppressWarnings("unchecked")
	@Override
	public ServiceResult checkLogin(String userName, String userPassword) {
		logger.debug("Enter LoginDaoImpl: checkLogin");
		SfCustomer sfCustomer = null;
		List<SfCustomer> userList = null;
		ServiceResult serviceResult = new ServiceResult();
		
		Session session = this.sessionFactory.getCurrentSession();
		Criteria criteria  = session.createCriteria(SfCustomer.class);
		criteria.add(Restrictions.eq("userName", userName));
		userList = criteria.list();
		if(userList!=null && !userList.isEmpty())
		{
			logger.info("username :: exists :");
			sfCustomer = userList.get(0);
			if(sfCustomer.getPassword().equals(userPassword))
			{
				serviceResult.getResultMap().put("sfCustomer",sfCustomer);
				serviceResult.setErrorCode(0);
			}
			else
			{
				serviceResult.setErrorCode(-1);
				serviceResult.setErrorMessage("Invalid password");
			}
			
		}
		else
		{
			serviceResult.setErrorCode(-2);
			serviceResult.setErrorMessage("User does not exist");
		}
		
		logger.info("Exit LoginDaoImpl: checkLogin");
		return serviceResult;
	}

}
