package com.ambdev21;

public class RunnableExample {
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Printed inside Runnable");
			}
		});

		t.start();

		Thread lambdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
		lambdaThread.start();
	}
}
