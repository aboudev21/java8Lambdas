package com.ambdev21;

public class Greeter {

	public void greet(Greeting greeting){
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		
		Greeting lambdaGreeting = () -> System.out.println("Hello world with lambda!");
		Greeting innerClassGreeting = new Greeting() {
			@Override
			public void perform() {
				System.out.println("Hello world with anonym inner class!");
			}
		};
		
		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassGreeting);
		
	}

}
