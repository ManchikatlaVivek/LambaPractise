package com.practise.lambaexp;

public class TypeInference {
	
	public static void printLambda(myLambda lam) {
		System.out.println(lam.getLength("Hello World!"));
	}
	 

	public static void main(String[] args) {
		myLambda ml = (s) -> s.length();
		System.out.println(ml.getLength("Hello World!"));
		printLambda(s -> s.length());

	}

}

interface myLambda{
	int getLength(String s);
	default void getp() {
		System.out.println("THis si a interface");
	}
}
