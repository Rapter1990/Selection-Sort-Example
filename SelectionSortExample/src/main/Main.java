package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import model.Person;
import selectionsort.SelectionSortProcess;
import util.DefineValues;
import util.ShowProcess;

public class Main {

	private static ArrayList<Person> personList = new ArrayList<>();
	private static ArrayList<Person> sortedpersonList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		
		personList = DefineValues.defineValues(personList);
		
		
		System.out.println("---------------------------------");
		System.out.println("BEFORE SELECTION SORT byId");
		ShowProcess.showValues(personList);	
		Person[] personsById = SelectionSortProcess.byId(personList);
		// Convert Array to ArrayList
		sortedpersonList = new ArrayList<>(Arrays.asList(personsById));
		System.out.println("AFTER SELECTION SORT byId");
		ShowProcess.showValues(sortedpersonList);	
		System.out.println("---------------------------------\n");
		
		System.out.println("BEFORE SELECTION SORT byLastName");		
		ShowProcess.showValues(personList);				
		sortedpersonList = SelectionSortProcess.byLastName(personList);	
		System.out.println("AFTER SELECTION SORT byLastName");
		ShowProcess.showValues(sortedpersonList);
		System.out.println("---------------------------------\n");
		
		System.out.println("BEFORE SELECTION SORT byName");
		ShowProcess.showValues(personList);
		sortedpersonList = SelectionSortProcess.byName(personList);
		System.out.println("AFTER SELECTION SORT byName");
		ShowProcess.showValues(sortedpersonList);
		System.out.println("---------------------------------\n");
		
		System.out.println("BEFORE SELECTION SORT byAge");		
		ShowProcess.showValues(personList);
		Person[] personsByAge = SelectionSortProcess.byAge(personList);
		// Convert Array to ArrayList
		sortedpersonList = new ArrayList<>(Arrays.asList(personsByAge));
		System.out.println("AFTER SELECTION SORT byAge");
		ShowProcess.showValues(sortedpersonList);
		System.out.println("---------------------------------");
	}
}
