package com.ambdev21;

/**
 * Marking an interface as a kind of a type interface for a lambda expression
 * @author BOUDEFFA AMIN
 *
 */

@FunctionalInterface
public interface Greeting {
	
	// Only one abstract method
	public void perform();
	
	default void display(){
		System.out.println("dummmy");
	}
	static String get(){
		return ("foo");
	}
}
