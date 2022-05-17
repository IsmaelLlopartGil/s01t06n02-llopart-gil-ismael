package edu.n2.exercise_2;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("rawtypes")
public class App  {

	@SuppressWarnings("unchecked")
	private void run() {

		Person person = new Person("Robert", "Jordan", 74);
		String string = "Cadena de text";
		int integer = 2022;
		char character = 'f';
		List<Object> list = new ArrayList<Object>();
		list.add(new Person("Ada", "Lovelace", 36));
		list.add(integer);
		list.add(character);
		list.add(string);
		list.add(person);
		
		List personList=new ArrayList<Person>();

		personList.add(person);
		personList.add(new Person ("Another", "Person", 87));
		personList.add(new Person ("Last", "Person", 34));

		GenericMethods.printArguments(list);
		GenericMethods.printArguments(personList);
		
	}

	public static void main(String[] args) {
		App app = new App();
		app.run();
	}

}
