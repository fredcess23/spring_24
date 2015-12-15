package com.mitocode.modelo;

public class Incident {

	int id;
	String type;
	String reported;
	int userId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getReported() {
		return reported;
	}
	public void setReported(String reported) {
		this.reported = reported;
	}
	public int getUserId() {
		return userId;
	}
	public void setUser_id(int userId) {
		this.userId = userId;
	}
		
}
