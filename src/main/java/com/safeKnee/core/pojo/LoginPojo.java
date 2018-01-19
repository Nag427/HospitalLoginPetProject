package com.safeKnee.core.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Login")
public class LoginPojo {
	@Id
	private int _id;
	private String type;
	private String username;
	private String password;
	public LoginPojo(int _id, String type, String username, String password) {
		super();
		this._id = _id;
		this.type = type;
		this.username = username;
		this.password = password;
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
