package com.ambdev21;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciceJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Amin", "Boudeffa", 26), new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carrall", 42), new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45), new Person("Matthew", "Arnold", 39));

		// step 1: Sort list by last name
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		// step 2: Create method that prints all elements in the list
		printAll(people);

		// step 3: Create method that prints all people that have last name
		// beginning with C
		printConditional(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});
	}

	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}

	private static void printConditional(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
	}
}

interface Condition{
	boolean test(Person p);
}