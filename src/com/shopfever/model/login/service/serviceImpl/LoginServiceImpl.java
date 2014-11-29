package com.shopfever.model.login.service.serviceImpl;
 
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shopfever.model.common.beans.ServiceResult;
import com.shopfever.model.login.dao.LoginDao;
import com.shopfever.model.login.service.LoginService;


@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	LoginDao logindao;
	
	static final Logger logger = Logger.getLogger(LoginServiceImpl.class);
	
	@Override
	@Transactional
	public ServiceResult checkLogin(String userName, String userPassword) {
		logger.info("Enter LoginServiceImpl: checkLogin");
		boolean loginCheck = false;
		ServiceResult serviceResult = null;
		
		serviceResult = logindao.checkLogin(userName, userPassword);
		
		logger.info("Exit LoginServiceImpl: checkLogin");
		return serviceResult;
	}

	
}
