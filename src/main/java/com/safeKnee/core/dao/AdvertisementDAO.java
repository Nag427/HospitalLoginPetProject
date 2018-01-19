package com.safeKnee.core.dao;

import java.util.List;

import com.mongodb.WriteResult;
import com.safeKnee.core.pojo.Advertisement;

public interface AdvertisementDAO {

	Advertisement find(Advertisement adv);

	List<Advertisement> findAll();

	void insert(Advertisement adv);

	void update(Advertisement adv);

	WriteResult remove(Advertisement adv);

}
