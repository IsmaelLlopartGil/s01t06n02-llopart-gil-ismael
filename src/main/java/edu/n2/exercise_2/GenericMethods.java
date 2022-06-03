package edu.n2.exercise_2;

public class GenericMethods {
	
	public static void printArguments (Person... args) {
		
		for (Person person : args) {
			System.out.println(person);
		}
	}
}
