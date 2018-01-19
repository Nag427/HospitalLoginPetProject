package com.safeKnee.core.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.mongodb.WriteResult;
import com.safeKnee.core.dao.HospitalDAO;
import com.safeKnee.core.pojo.HospitalPojo;


@Repository
@Qualifier("hospitalDAO")
public class HospitalDAOImpl implements HospitalDAO {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	final String COLLECTION="Hospital";
	@Override
	public HospitalPojo find(HospitalPojo hos) {
		Query query = new Query(Criteria.where("_id").is(hos.get_id()));
        return mongoTemplate.findOne(query, HospitalPojo.class, COLLECTION);
	}

	@Override
	public List<HospitalPojo> findAll() {
		return mongoTemplate.findAll(HospitalPojo.class);
	}
	@Override
	public void insert(HospitalPojo hos){
		mongoTemplate.insert(hos);
		
	}
	@Override
	public WriteResult remove(HospitalPojo hos){
		return mongoTemplate.remove(hos);
	}

	@Override
	public void update(HospitalPojo hos) {
		mongoTemplate.save(hos);
		
	}
	
	

}
