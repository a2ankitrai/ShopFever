package com.shopfever.model.customer.service;

import java.util.ArrayList;

import com.shopfever.view.admin.bean.CustomerBean;

public interface CustomerService {

	public Boolean addNewUser(CustomerBean customerBean) throws Exception;
	public ArrayList<CustomerBean> getallCustomers() throws Exception;
	
}
