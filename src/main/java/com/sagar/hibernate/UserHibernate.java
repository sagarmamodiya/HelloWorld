package com.sagar.hibernate;

import java.util.ArrayList;

public class UserHibernate
{

	int id;
    String name;
    String email;
    String password;
    String gender;
    String address;
    ArrayList usersList ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ArrayList getUsersList() {
		return usersList;
	}
	public void setUsersList(ArrayList usersList) {
		this.usersList = usersList;
	}
    
	
}
