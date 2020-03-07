package com.practise.lambaexp;

public class FirstLambda {

	public void drive(Vehicle Dsire) {
		Dsire.forward();
	}

	public static void main(String[] args) {
		
		Car Swift = new Car();

		Vehicle mylamba = () -> System.out.println("This Vehicle is Car");
		mylamba.forward();
		Swift.forward();

	}

}
