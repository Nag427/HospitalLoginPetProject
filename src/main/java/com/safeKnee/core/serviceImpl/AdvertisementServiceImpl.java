package com.safeKnee.core.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.WriteResult;
import com.safeKnee.core.dao.AdvertisementDAO;
import com.safeKnee.core.pojo.Advertisement;
import com.safeKnee.core.service.AdvertisementService;


@Service("advService")
public class AdvertisementServiceImpl implements AdvertisementService{
	
	@Autowired
	AdvertisementDAO advDAO;
	@Override
	public Advertisement find(Advertisement adv) {
		
		return advDAO.find(adv);
	}

	@Override
	public List<Advertisement> findAll() {
		return advDAO.findAll();
	}

	@Override
	public void insert(Advertisement adv) {
		 advDAO.insert( adv);
		
	}

	@Override
	public void update(Advertisement adv) {
		 advDAO.update( adv);
		
	}

	@Override
	public int remove(Advertisement adv) {
		WriteResult wr=advDAO.remove( adv);
		return wr!=null?wr.getN():0;
	}

}
