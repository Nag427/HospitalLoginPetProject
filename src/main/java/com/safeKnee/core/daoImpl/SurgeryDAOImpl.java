package com.safeKnee.core.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.mongodb.WriteResult;
import com.safeKnee.core.dao.SurgeryDAO;
import com.safeKnee.core.pojo.SurgeryPojo;


@Repository
@Qualifier("surDAO")
public class SurgeryDAOImpl implements SurgeryDAO {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	final String COLLECTION="Surgery";
	@Override
	public SurgeryPojo find(SurgeryPojo sur) {
		Query query = new Query(Criteria.where("_id").is(sur.get_id()));
        return mongoTemplate.findOne(query, SurgeryPojo.class, COLLECTION);
	}

	@Override
	public List<SurgeryPojo> findAll() {
		return mongoTemplate.findAll(SurgeryPojo.class);
	}
	@Override
	public void insert(SurgeryPojo sur){
		mongoTemplate.insert(sur);
		
	}
	@Override
	public WriteResult remove(SurgeryPojo sur){
		return mongoTemplate.remove(sur);
	}

	@Override
	public void update(SurgeryPojo sur) {
		mongoTemplate.save(sur);
		
	}
	
	

}
