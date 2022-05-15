package edu.n6.exercise_2;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Person person=new Person("Robert", "Jordan", 74);
		String string="Cadena de text";
		int integer=2022;
		char character='f';
		ArrayList<Person> personList=new ArrayList<Person>();
		personList.add(new Person("Ada", "Lovelace", 36));
		
		ArrayList arrayList=new ArrayList();
		arrayList.add(personList);
		arrayList.add(string);
		arrayList.add(integer);	
		GenericMethods.printArguments(arrayList);
		
		ArrayList arrayList2=new ArrayList();
		arrayList2.add(integer);
		arrayList2.add(person);
		arrayList2.add(character);	
		GenericMethods.printArguments(arrayList2);
		
		ArrayList arrayList3=new ArrayList();
		arrayList3.add(character);
		arrayList3.add(personList);
		arrayList3.add(string);	
		GenericMethods.printArguments(arrayList3);
	}
}
