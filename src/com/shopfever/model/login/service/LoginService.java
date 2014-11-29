package com.shopfever.model.login.service;

import com.shopfever.model.common.beans.ServiceResult;

public interface LoginService {

	public ServiceResult checkLogin(String userName, String userPassword);
}
