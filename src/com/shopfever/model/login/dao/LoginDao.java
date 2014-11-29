package com.shopfever.model.login.dao;

import com.shopfever.model.common.beans.ServiceResult;

public interface LoginDao {

	public ServiceResult checkLogin(String userName, String userPassword);
}
