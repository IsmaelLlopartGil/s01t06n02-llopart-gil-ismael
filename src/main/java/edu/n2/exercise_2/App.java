package edu.n2.exercise_2;

import java.util.ArrayList;
import java.util.List;

public class App  {

	private void run() {

		Person person = new Person("Robert", "Jordan", 74);
		String string = "Cadena de text";
			
		List<Person> personList=new ArrayList<>();
		personList.add(person);
		personList.add(new Person ("Another", "Person", 87));
		personList.add(new Person ("Last", "Person", 34));
		GenericMethods.printArguments(personList);
		
		List<String> stringList = new ArrayList<>();
		stringList.add(string);
		stringList.add("2 cadena");
		stringList.add("3 cadena");
		stringList.add("4 cadena");
		GenericMethods.printArguments(stringList);		
	}

	public static void main(String[] args) {
		App app = new App();
		app.run();
	}

}
