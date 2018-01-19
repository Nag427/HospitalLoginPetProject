package com.safeKnee.core.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.mongodb.WriteResult;
import com.safeKnee.core.dao.LoginDAO;
import com.safeKnee.core.pojo.LoginPojo;


@Repository
@Qualifier("loginDAO")
public class LoginDAOImpl implements LoginDAO {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	final String COLLECTION="Login";
	@Override
	public LoginPojo find(LoginPojo login) {
		Query query = new Query(Criteria.where("_id").is(login.get_id()));
        return mongoTemplate.findOne(query, LoginPojo.class, COLLECTION);
	}

	@Override
	public List<LoginPojo> findAll() {
		return mongoTemplate.findAll(LoginPojo.class);
	}
	@Override
	public void insert(LoginPojo login){
		mongoTemplate.insert(login);
		
	}
	@Override
	public WriteResult remove(LoginPojo login){
		return mongoTemplate.remove(login);
	}

	@Override
	public void update(LoginPojo login) {
		mongoTemplate.save(login);
		
	}
	
	

}
