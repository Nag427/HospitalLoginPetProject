package com.safeKnee.core.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.WriteResult;
import com.safeKnee.core.dao.SurgeryDAO;
import com.safeKnee.core.pojo.SurgeryPojo;
import com.safeKnee.core.service.SurgeryService;


@Service("surService")
public class SurgeryServiceImpl implements SurgeryService{
	
	@Autowired
	SurgeryDAO surDAO;
	@Override
	public SurgeryPojo find(SurgeryPojo sur) {
		
		return surDAO.find(sur);
	}

	@Override
	public List<SurgeryPojo> findAll() {
		return surDAO.findAll();
	}

	@Override
	public void insert(SurgeryPojo sur) {
		surDAO.insert( sur);
		
	}

	@Override
	public void update(SurgeryPojo sur) {
		surDAO.update( sur);
		
	}

	@Override
	public int remove(SurgeryPojo sur) {
		WriteResult wr=surDAO.remove( sur);
		return wr!=null?wr.getN():0;
	}

}
