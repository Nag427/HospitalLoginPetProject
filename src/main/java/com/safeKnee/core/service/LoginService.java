package com.safeKnee.core.service;

import java.util.List;

import com.safeKnee.core.pojo.LoginPojo;


public interface LoginService {
	public LoginPojo find(LoginPojo login );
	public List<LoginPojo> findAll();
	public void insert(LoginPojo login);
	public void update(LoginPojo login);
	public int remove(LoginPojo login);
	
}
