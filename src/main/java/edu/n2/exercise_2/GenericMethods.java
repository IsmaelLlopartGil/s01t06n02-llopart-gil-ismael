package edu.n2.exercise_2;

import java.util.List;

public class GenericMethods {
	
	public static <T> void printArguments (List<? super T> list) {
		
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
