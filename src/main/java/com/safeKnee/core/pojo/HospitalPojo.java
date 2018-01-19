package com.safeKnee.core.pojo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Hospital")
public class HospitalPojo {
	@Id
	private int _id;
	String name;
	String location;
	List<SurgeryHospital> surgeries;
	String description;
	
	public HospitalPojo(String name, String location, List<SurgeryHospital> surgeries,String description){
		super();
		this.name=name;
		this.location=location;
		this.surgeries=surgeries;
		this.description=description;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<SurgeryHospital> getSurgeries() {
		return surgeries;
	}

	public void setSurgeries(List<SurgeryHospital> surgeries) {
		this.surgeries = surgeries;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
