package com.shopfever.view.customer.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shopfever.model.customer.service.CustomerService;
import com.shopfever.view.admin.bean.CustomerBean;

import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value="/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;

	private static Logger logger = Logger.getLogger(CustomerController.class);
	
	@RequestMapping(value = "/createNewAccountLoad", method = RequestMethod.GET)
	public ModelAndView addNewUserLoad(HttpSession session)
	{
		logger.debug("Entry : CustomerController :: addNewUserLoad "); 
		
		ModelAndView mav = new ModelAndView();
		CustomerBean customerBean = new CustomerBean();
		
		mav.addObject("customerBean", customerBean);
		mav.setViewName("customer/createNewAccount");
		logger.debug("Exit : CustomerController :: addNewUserLoad ");  
		return mav;
	}
	
	@RequestMapping(value = "/createNewAccount", method = RequestMethod.POST)
	public ModelAndView createNewAccount(@ModelAttribute("customerBean") CustomerBean customerBean,
										@RequestParam("photograph") MultipartFile file,HttpSession session,
										HttpServletRequest request)
	{
		logger.debug("Entry : CustomerController :: createNewAccount "); 
		ModelAndView mav = new ModelAndView();
		try{
			if (!file.isEmpty()) 
			{
					byte[] filebytes = file.getBytes();
					customerBean.setPhotograph(filebytes);
			}	 
			customerService.addNewUser(customerBean);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			request.setAttribute("error", e.getMessage());
			mav.setViewName("common/errorPage");
			
		}
		
		mav.setViewName("customer/createAccountSuccess");
		logger.debug("Entry : CustomerController :: createNewAccount "); 
		return mav;
		
	}
}
