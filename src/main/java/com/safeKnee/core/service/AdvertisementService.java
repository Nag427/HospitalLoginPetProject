package com.safeKnee.core.service;

import java.util.List;

import com.safeKnee.core.pojo.Advertisement;


public interface AdvertisementService {
	public Advertisement find(Advertisement adv );
	public List<Advertisement> findAll();
	public void insert(Advertisement adv);
	public void update(Advertisement adv);
	public int remove(Advertisement adv);
	
}
