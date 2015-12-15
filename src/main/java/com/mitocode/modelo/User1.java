package com.mitocode.modelo;

public class User1 {
	
	Integer id;
	String name;
	String lastName;
	String password;
	String type;
	Integer age;
	Integer locationId;
	
	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public User1(Integer id, String name, String lastName, String password, String type, Integer age, Integer locationId){
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.password = password;
		this.type = type;
		this.age = age;
		this.locationId = locationId;
	}

	public User1(String name, String lastName, String password, String type, Integer age, Integer locationId){
		this.name = name;
		this.lastName = lastName;
		this.password = password;
		this.type = type;
		this.age = age;
		this.locationId = locationId;

	}
	
	public User1(){}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	
}
