package util;

import java.util.ArrayList;

import model.Person;

public class DefineValues {

	public static ArrayList<Person> defineValues(ArrayList<Person> personList) {
		
		Person person1 = new Person();
		person1.setId(5);
		person1.setName("Ali");
		person1.setLastname("Mert");
		person1.setAge(21);
		
		Person person2 = new Person();
		person2.setId(1);
		person2.setName("Gizem");
		person2.setLastname("Özge");
		person2.setAge(25);
		
		Person person3 = new Person();
		person3.setId(4);
		person3.setName("Köktuð");
		person3.setLastname("Mert");
		person3.setAge(20);
		
		Person person4 = new Person();
		person4.setId(2);
		person4.setName("Ali");
		person4.setLastname("Yaðmur");
		person4.setAge(16);

		Person person5 = new Person();
		person5.setId(6);
		person5.setName("Pelinsu");
		person5.setLastname("Ýlkem");
		person5.setAge(30);
		
		Person person6 = new Person();
		person6.setId(3);
		person6.setName("Çaðrý");
		person6.setLastname("Özgen");
		person6.setAge(27);
		
		Person person7 = new Person();
		person7.setId(8);
		person7.setName("Eda");
		person7.setLastname("Can");
		person7.setAge(41);
		
		Person person8 = new Person();
		person8.setId(7);
		person8.setName("Polen");
		person8.setLastname("Rengi");
		person8.setAge(36);
		
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		personList.add(person5);
		personList.add(person6);
		personList.add(person7);
		personList.add(person8);
		
		return personList;
	}
}
