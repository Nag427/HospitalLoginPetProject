package com.safeKnee.core.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Advertisement")
public class Advertisement {
	@Id
	private int _id;
	private int hospital;
	private long startDate;
	private long endDate;
	private float amountPaid;
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public int getHospital() {
		return hospital;
	}
	public void setHospital(int hospital) {
		this.hospital = hospital;
	}
	public long getStartDate() {
		return startDate;
	}
	public void setStartDate(long startDate) {
		this.startDate = startDate;
	}
		public float getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(float amountPaid) {
		this.amountPaid = amountPaid;
	}
	
	
	public long getEndDate() {
		return endDate;
	}
	public void setEndDate(long endDate) {
		this.endDate = endDate;
	}
	public Advertisement(int hospital, long startDate,long endDate, float amountPaid){
		super();
		this.hospital=hospital;
		this.startDate=startDate;
		this.endDate=endDate;
		this.amountPaid=amountPaid;
	}
	
	@Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Id:- " + get_id() + ", Hospital:- " + getHospital() + ", Start Date:- " + getStartDate()+ ", End Date:- " + getEndDate()+ ", Amount Paid:- " + getAmountPaid());
        return str.toString();
    }
}
