package edu.n2.exercise_2;

import java.util.List;

public class GenericMethods {
	
	public static <T> void printArguments (List<T> list) {
		
		for (T element : list) {
			System.out.println(element);
		}
	}
}
