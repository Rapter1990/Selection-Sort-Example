package util;

import java.util.ArrayList;

import model.Person;

public class ShowProcess {

	public static void showValues(ArrayList<Person> personList) {
		System.out.println("Person List");
		for(Person person : personList) {
			System.out.println("ID : " + person.getId() + " || "
			                 + "NAME : " + person.getName() + " || "
					         + "LASTNAME : " + person.getLastname() + " || "
					         + "AGE : " + person.getAge());
		}
	}
}
