package com.shopfever.model.common.beans;

import java.util.HashMap;

public class ServiceResult {
	
	HashMap<String,Object> resultMap;
	HashMap<String,Object> paramMap;
	int errorCode;
	String errorMessage;
	
	public ServiceResult(){
		this.resultMap = new HashMap<String,Object>();
		this.paramMap = new HashMap<String,Object>();
		this.errorMessage = new StringBuilder().toString();
	}
	
	public HashMap<String, Object> getResultMap() {
		return resultMap;
	}
	public void setResultMap(HashMap<String, Object> resultMap) {
		this.resultMap = resultMap;
	}
	public HashMap<String, Object> getParamMap() {
		return paramMap;
	}
	public void setParamMap(HashMap<String, Object> paramMap) {
		this.paramMap = paramMap;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
