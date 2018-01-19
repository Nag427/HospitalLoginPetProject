package com.safeKnee.core.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.mongodb.WriteResult;
import com.safeKnee.core.dao.AdvertisementDAO;
import com.safeKnee.core.pojo.Advertisement;


@Repository
@Qualifier("advDAO")
public class AdvertisementDAOImpl implements AdvertisementDAO {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	final String COLLECTION="Advertisement";
	@Override
	public Advertisement find(Advertisement adv) {
		Query query = new Query(Criteria.where("_id").is(adv.get_id()));
        return mongoTemplate.findOne(query, Advertisement.class, COLLECTION);
	}

	@Override
	public List<Advertisement> findAll() {
		return mongoTemplate.findAll(Advertisement.class);
	}
	
	public void insert(Advertisement adv){
		mongoTemplate.insert(adv);
		
	}
	
	public WriteResult remove(Advertisement adv){
		return mongoTemplate.remove(adv);
	}

	@Override
	public void update(Advertisement adv) {
		mongoTemplate.save(adv);
		
	}
	
	

}
