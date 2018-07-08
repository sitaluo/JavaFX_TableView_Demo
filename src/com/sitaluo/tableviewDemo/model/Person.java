package com.sitaluo.tableviewDemo.model;

public class Person {
	private Integer id;
	private String firstName;
	private String lastName;
	private String headImgUrl;
	
	public Person() {}
	public Person(Integer id,String firstName,String lastName,String headImgUrl) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.headImgUrl = headImgUrl;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getHeadImgUrl() {
		return headImgUrl;
	}
	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}
	
}
