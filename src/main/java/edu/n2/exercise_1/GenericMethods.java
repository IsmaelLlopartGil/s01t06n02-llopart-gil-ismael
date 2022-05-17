package edu.n2.exercise_1;


public class GenericMethods {
	
	public static <T> void printArguments (String s1, T t2, T t3) {
		System.out.println(s1);
		System.out.println(t2);
		System.out.println(t3);
	}
}
