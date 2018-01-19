package com.safeKnee.core.dao;

import java.util.List;

import com.mongodb.WriteResult;
import com.safeKnee.core.pojo.LoginPojo;

public interface LoginDAO {

	LoginPojo find(LoginPojo sur);

	List<LoginPojo> findAll();

	void insert(LoginPojo sur);

	void update(LoginPojo sur);

	WriteResult remove(LoginPojo sur);

}
