package com.shopfever.model.customer.dao;

import java.util.ArrayList;

import com.shopfever.model.hbm.SfCustomer;

public interface CustomerDao {
	public boolean addNewUser(SfCustomer sfCustomer) throws Exception;
	public ArrayList<SfCustomer> getallCustomers() throws Exception;
	

}
