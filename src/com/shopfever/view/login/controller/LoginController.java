package com.shopfever.view.login.controller;
 
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shopfever.model.common.beans.ServiceResult;
import com.shopfever.model.hbm.SfCustomer;
import com.shopfever.model.login.service.LoginService;
 


@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	static final Logger logger = Logger.getLogger(LoginController.class);  

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String getUserLogin(@RequestParam(value = "j_username", required = false) String userName, 
			@RequestParam(value = "j_password", required = false) String userPassword, ModelMap model
			,HttpServletRequest request)
	{
		logger.info("Entry : LoginController :: getUserLogin");
		String returnPage = null;
		ServiceResult serviceResult = null;
		SfCustomer sfCustomer = null;
	
		/*if(username.equals("ankit") && password.equals("ankit"))
		{
			returnPage = "admin/welcome";
		}
		else{
			returnPage = "login/loginError";
			
		}*/
		
		serviceResult = loginService.checkLogin(userName, userPassword);
		
		if(serviceResult.getErrorCode()==0)
		{
			request.setAttribute("customerDetail", serviceResult.getResultMap().get("sfCustomer"));
			returnPage = "admin/welcome";
		}
		else
		{
			returnPage = "login/loginError";
			
		}
		logger.info("Exit : LoginController :: getUserLogin");
		return returnPage;
	}
	
}
