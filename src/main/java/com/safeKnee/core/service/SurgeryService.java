package com.safeKnee.core.service;

import java.util.List;

import com.safeKnee.core.pojo.SurgeryPojo;


public interface SurgeryService {
	public SurgeryPojo find(SurgeryPojo sur );
	public List<SurgeryPojo> findAll();
	public void insert(SurgeryPojo sur);
	public void update(SurgeryPojo sur);
	public int remove(SurgeryPojo sur);
	
}
