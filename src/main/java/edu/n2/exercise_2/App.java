package edu.n2.exercise_2;

import java.util.*;

public class App  {

	private void run() {
			
		List<Person> personList=new ArrayList<>();
		personList.add(new Person("Robert", "Jordan", 74));
		personList.add(new Person ("Another", "Person", 87));
		personList.add(new Person ("Last", "Person", 34));
		
		GenericMethods.printArguments(
				personList.get(0),
				personList.get(1),
				personList.get(2));
		
		GenericMethods.printArguments(
				personList.get(0),
				personList.get(1));

	}

	public static void main(String[] args) {
		App app = new App();
		app.run();
	}

}
