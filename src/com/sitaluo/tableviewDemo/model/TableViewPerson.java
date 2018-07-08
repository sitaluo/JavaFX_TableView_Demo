package com.sitaluo.tableviewDemo.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TableViewPerson {
	private IntegerProperty id;
	private StringProperty firstName;
	private StringProperty lastName;
	private StringProperty headImgUrl;
	
	public TableViewPerson(Person person) {
		setFirstName(person.getFirstName());
		setLastName(person.getLastName());
		setId(person.getId());
		setHeadImgUrl(person.getHeadImgUrl());
	}

	public TableViewPerson(Integer id, String firstName, String lastName, String headImgUrl) {
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setHeadImgUrl(headImgUrl);
	}

	public final void setFirstName(String value) {
		firstNameProperty().set(value);
	}

	public final void setLastName(String value) {
		lastNameProperty().set(value);
	}

	public final void setId(Integer value) {
		idProperty().set(value);
	}

	public final void setHeadImgUrl(String value) {
		headImgUrlProperty().set(value);
	}
	
	public Integer getId() {
		return idProperty().get();
	}
	public String getFirstName() {
		return firstNameProperty().get();
	}

	public String getLastName() {
		return lastNameProperty().get();
	}
	
	public IntegerProperty idProperty() {
		if (id == null)
			id = new SimpleIntegerProperty(this, "id");
		return id;
	}

	public StringProperty firstNameProperty() {
		if (firstName == null)
			firstName = new SimpleStringProperty(this, "firstName");
		return firstName;
	}

	public StringProperty lastNameProperty() {
		if (lastName == null)
			lastName = new SimpleStringProperty(this, "lastName");
		return lastName;
	}

	public StringProperty headImgUrlProperty() {
		if (headImgUrl == null)
			headImgUrl = new SimpleStringProperty(this, "headImgUrl");
		return headImgUrl;
	}
}