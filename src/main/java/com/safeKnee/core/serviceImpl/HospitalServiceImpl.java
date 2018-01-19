package com.safeKnee.core.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.WriteResult;
import com.safeKnee.core.dao.HospitalDAO;
import com.safeKnee.core.pojo.HospitalPojo;
import com.safeKnee.core.service.HospitalService;


@Service("hosService")
public class HospitalServiceImpl implements HospitalService{
	
	@Autowired
	HospitalDAO hosDAO;
	@Override
	public HospitalPojo find(HospitalPojo hos) {
		
		return hosDAO.find(hos);
	}

	@Override
	public List<HospitalPojo> findAll() {
		return hosDAO.findAll();
	}

	@Override
	public void insert(HospitalPojo hos) {
		hosDAO.insert( hos);
		
	}

	@Override
	public void update(HospitalPojo hos) {
		hosDAO.update( hos);
		
	}

	@Override
	public int remove(HospitalPojo hos) {
		WriteResult wr=hosDAO.remove( hos);
		return wr!=null?wr.getN():0;
	}

}
