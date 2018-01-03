package com.ambdev21;

public class Greeter {

	public void greet(Greeting greeting){
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		
		//MyLambdaInterfaceType myLambdaFunction = () -> System.out.println("Hello world with lambda!");
		Greeting myLambdaFunction = () -> System.out.println("Hello world with lambda!");
	}

}

/*interface MyLambdaInterfaceType{
	void foo();
}*/
