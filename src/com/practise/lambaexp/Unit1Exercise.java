package com.practise.lambaexp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1Exercise {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Vivek", "Manchikatla", 23),
				new Person("Anand", "Inarla", 25),
				new Person("Sravan", "Sapati", 24),
				new Person("Ashok", "Pendota", 26),
				new Person("Gaurav", "Gautam", 28)
				);
		
		Collections.sort(people,(p1,p2) ->  p1.getFirstName().compareTo(p2.getFirstName()) );
		printConditionally(people, p -> true);
		System.out.println("-------------------------------------------------------------");
		
		Collections.sort(people,(p1,p2) -> p1.getLastName().compareTo(p2.getLastName()) );
		printConditionally(people, p -> true);
		
		System.out.println("-------------------------------------------------------------");
		printConditionally(people,(p1) -> p1.getFirstName().startsWith("A"));
		
		System.out.println("-------------------------------------------------------------");
		printConditionally(people,(p1) -> {
			if(p1.getAge()<=25) 
				return true;
			return false;
		});
		

	}
	public static void printList(List<Person> l) {
		for(Person p:l) {
			System.out.println(p);
		}
	}
	public static void printConditionally(List<Person> people, Condition state ) {
		for(Person p : people) {
			boolean status = state.check(p);
			if(status) {
				System.out.println(p);
			}
		}
		
		
	}

}
interface Condition{
	boolean check(Person p);
}

