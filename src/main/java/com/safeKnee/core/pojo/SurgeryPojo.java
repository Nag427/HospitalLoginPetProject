package com.safeKnee.core.pojo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Surgery")
public class SurgeryPojo {
	@Id
	private int _id;
	private String name;
	private String description;
	private List<Integer> hospitals;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Integer> getHospitals() {
		return hospitals;
	}
	public void setHospitals(List<Integer> hospitals) {
		this.hospitals = hospitals;
	}
	public SurgeryPojo(int _id, String name, String description, List<Integer> hospitals) {
		super();
		this._id = _id;
		this.name = name;
		this.description = description;
		this.hospitals = hospitals;
	}
	
}
