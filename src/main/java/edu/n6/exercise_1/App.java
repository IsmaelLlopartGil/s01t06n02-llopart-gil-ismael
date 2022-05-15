package edu.n6.exercise_1;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Person person=new Person("Robert", "Jordan", 74);
		String string="Cadena de text";
		int integer=2022;
		char character='f';
		ArrayList<Person> personList=new ArrayList<Person>();
		personList.add(new Person("Ada", "Lovelace", 36));
		
	//	GenericMethods.printArguments(person, string, integer);
	//	GenericMethods.printArguments(integer, person, string);
		
	//	GenericMethods.printArguments(character, person, personList);
		GenericMethods.printArguments(string, integer, person);

	}

}
