package _9_OOPs;

//Java Example: Run Time Polymorphism
class Vehicle_5_2 {
	public void displayInfo() {
		System.out.println("Some Vehicle_5_2s are there.");
	}
}

class Car extends Vehicle_5_2 {
// Method overriding
	@Override
	public void displayInfo() {
		System.out.println("I have a Car.");
	}
}

class Bike extends Vehicle_5_2 {
// Method overriding
	@Override
	public void displayInfo() {
		System.out.println("I have a Bike.");
	}
}

public class _5_2_RunTimePolymorphism {
	public static void main(String[] args) {
		Vehicle_5_2 v1 = new Car(); // Upcasting
		Vehicle_5_2 v2 = new Bike(); // Upcasting

		// Calling the overridden displayInfo() method of Car class
		v1.displayInfo();

		// Calling the overridden displayInfo() method of Bike class
		v2.displayInfo();
	}
}