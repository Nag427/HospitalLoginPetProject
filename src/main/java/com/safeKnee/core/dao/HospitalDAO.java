package com.safeKnee.core.dao;

import java.util.List;

import com.mongodb.WriteResult;
import com.safeKnee.core.pojo.HospitalPojo;

public interface HospitalDAO {
	public HospitalPojo find(HospitalPojo hos);

	
	public List<HospitalPojo> findAll() ;
	
	public void insert(HospitalPojo hos);
	public WriteResult remove(HospitalPojo hos);
	public void update(HospitalPojo hos) ;

}
