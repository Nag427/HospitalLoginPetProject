package com.safeKnee.core.pojo;

public class SurgeryHospital {
	int surgery;
	float cost;
	float anesthisia;

	public SurgeryHospital(int surgery,float cost, float anesthisia){
		super();
		this.surgery=surgery;
		this.cost=cost;
		this.anesthisia=anesthisia;
	}

	public int getSurgery() {
		return surgery;
	}

	public void setSurgery(int surgery) {
		this.surgery = surgery;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public float getAnesthisia() {
		return anesthisia;
	}

	public void setAnesthisia(float anesthisia) {
		this.anesthisia = anesthisia;
	}
	
}
