package com.safeKnee.core.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.WriteResult;
import com.safeKnee.core.dao.LoginDAO;
import com.safeKnee.core.pojo.LoginPojo;
import com.safeKnee.core.service.LoginService;


@Service("loginService")
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	LoginDAO loginDAO;
	@Override
	public LoginPojo find(LoginPojo login) {
		
		return loginDAO.find(login);
	}

	@Override
	public List<LoginPojo> findAll() {
		return loginDAO.findAll();
	}

	@Override
	public void insert(LoginPojo login) {
		loginDAO.insert( login);
		
	}

	@Override
	public void update(LoginPojo login) {
		loginDAO.update( login);
		
	}

	@Override
	public int remove(LoginPojo login) {
		WriteResult wr=loginDAO.remove( login);
		return wr!=null?wr.getN():0;
	}

}
