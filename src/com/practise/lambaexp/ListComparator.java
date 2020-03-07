package com.practise.lambaexp;

import java.util.Comparator;

public class ListComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub		
		return o1.getFirstName().compareTo(o2.getFirstName());
	}

}
