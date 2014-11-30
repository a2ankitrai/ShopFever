/*
 *Author : Ankit Rai
 */

package com.shopfever.view.admin.controller;


import java.util.ArrayList;

import javax.servlet.http.HttpSession;
 

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.shopfever.model.customer.service.CustomerService;
import com.shopfever.view.admin.bean.CustomerBean;


@Controller
@RequestMapping(value="/admin")
public class AdminController {

	@Autowired
	CustomerService customerService;
 	
	private static final Logger logger = Logger.getLogger(AdminController.class);
   

	@RequestMapping(value = "/adminLoadAddUser", method = RequestMethod.GET)
	public ModelAndView addNewUserLoad(HttpSession session)
	{
		logger.debug("Entry : AdminController :: addNewUserLoad "); 
		
		ModelAndView mav = new ModelAndView();
		CustomerBean customerBean = new CustomerBean();
	 
		mav.addObject("customerBean", customerBean);
		mav.setViewName("admin/addNewUser");
		logger.debug("Exit : AdminController :: addNewUserLoad ");  
		return mav;
	}
	
	
	@RequestMapping(value = "/adminAddUser", method = RequestMethod.POST)
	public ModelAndView addNewUserDo(/*@RequestParam(value = "imageUpload", required = false) MultipartFile file,*/
										@ModelAttribute("customerBean") CustomerBean customerBean,
										HttpSession session)
	{
	  
		ModelAndView mav = new ModelAndView();
		
		/*if (!file.isEmpty()) {
			try 
			{
				byte[] photograph = file.getBytes();
				
				customerBean.setPhotograph(photograph);
			}
			catch(Exception e){
				
				e.printStackTrace();
			}
			
		}*/
		
		 
		
		try
		{
			customerService.addNewUser(customerBean);
		} 
		catch(Exception e)
		{
			e.printStackTrace();
			mav.setViewName("login/loginError");
		}
		mav.setViewName("admin/addNewUserSuccess");
		
	 
		return mav;
		}
	
	@RequestMapping(value = "/updateExistingUser", method = RequestMethod.POST)
	public ModelAndView updateExistingUser()
	{
	 
		ModelAndView mav = new ModelAndView();
		ArrayList<CustomerBean> customerList = null;
		
		try{
			customerList = customerService.getallCustomers();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		mav.setViewName("admin/updateExistingUser");
	 
		return mav;
	}
 	
}
	
