package com.shopfever.model.customer.service.impl;

import java.util.ArrayList;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shopfever.model.customer.dao.CustomerDao;
import com.shopfever.model.customer.dao.impl.CustomerDaoImpl;
import com.shopfever.model.customer.service.CustomerService;
import com.shopfever.model.hbm.SfCustomer;
import com.shopfever.view.admin.bean.CustomerBean;
import com.shopfever.view.admin.controller.AdminController;

@Service

public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao customerDao;
	 
	@Transactional(readOnly = false, propagation=Propagation.REQUIRED)
	public Boolean addNewUser(CustomerBean customerBean) throws Exception
	{
  
		Boolean successFlag = false;
		
		SfCustomer sfCustomer = new SfCustomer();
		
		sfCustomer.setUserName(customerBean.getUserName());
		sfCustomer.setFirstName(customerBean.getFirstName());
		sfCustomer.setMiddleName(customerBean.getMiddleName());
		sfCustomer.setLastName(customerBean.getLastName());
		sfCustomer.setMobileNo(customerBean.getMobileNo());
		sfCustomer.setEmailId(customerBean.getEmailId());
		sfCustomer.setPhotograph(customerBean.getPhotograph());
		sfCustomer.setPassword("password");
		if(customerBean.getPhotograph() != null)
		{
			sfCustomer.setPhotograph(customerBean.getPhotograph());
		}
		
		successFlag = customerDao.addNewUser(sfCustomer);
			 
		return successFlag;
	}
	 
	public ArrayList<CustomerBean> getallCustomers() throws Exception
	{
	 
		ArrayList<CustomerBean> customerList = null;
		ArrayList<SfCustomer> customerPojoList = null;
		
		customerPojoList = customerDao.getallCustomers();
		
		if(customerPojoList!=null && !customerPojoList.isEmpty())
		{
			customerList =  new ArrayList<CustomerBean>();
			
			for(SfCustomer customerPojo : customerPojoList)
			{
				CustomerBean customerBean = new CustomerBean();
				
				customerBean.setFirstName(customerPojo.getFirstName());
				customerBean.setLastName(customerPojo.getLastName());
				customerBean.setMiddleName(customerPojo.getMiddleName());
				customerBean.setEmailId(customerPojo.getEmailId());
				customerBean.setMobileNo(customerPojo.getMobileNo());
				customerBean.setPhotograph(customerPojo.getPhotograph());
				
				customerList.add(customerBean);
				
			}
		} 
		return customerList;
	}

}
