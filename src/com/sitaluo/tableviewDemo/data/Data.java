package com.sitaluo.tableviewDemo.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sitaluo.tableviewDemo.model.Person;
import com.sitaluo.tableviewDemo.model.TableViewPerson;

public class Data {
	private static List<Person> getPersonList() {
		List<Person> list = Arrays.asList(
				new Person(1,"三","张",""),
				new Person(2,"四","李",""),
				new Person(3,"五","王",""),
				new Person(4,"六","赵",""),
				new Person(5,"王","老","")
				);
		return list;
	}
	
	public static List<TableViewPerson> getTableViewPersonList(){
		List<TableViewPerson> list = new ArrayList<>();
		for (Person  person: getPersonList()) {
			TableViewPerson tp = new TableViewPerson(person);
			list.add(tp);
		}
		return list;
	}
}
