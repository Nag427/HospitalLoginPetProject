package com.safeKnee.core.dao;

import java.util.List;

import com.mongodb.WriteResult;
import com.safeKnee.core.pojo.SurgeryPojo;

public interface SurgeryDAO {

	SurgeryPojo find(SurgeryPojo sur);

	List<SurgeryPojo> findAll();

	void insert(SurgeryPojo sur);

	void update(SurgeryPojo sur);

	WriteResult remove(SurgeryPojo sur);

}
