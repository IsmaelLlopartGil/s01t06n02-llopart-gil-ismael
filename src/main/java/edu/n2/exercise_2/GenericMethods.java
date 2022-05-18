package edu.n2.exercise_2;

import java.util.List;

public class GenericMethods {
	
	public static void printArguments (List<?> list) {
		
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
