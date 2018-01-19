package com.safeKnee.core.service;

import java.util.List;

import com.safeKnee.core.pojo.HospitalPojo;


public interface HospitalService {
	public HospitalPojo find(HospitalPojo hos );
	public List<HospitalPojo> findAll();
	public void insert(HospitalPojo hos);
	public void update(HospitalPojo hos);
	public int remove(HospitalPojo hos);
	
}
