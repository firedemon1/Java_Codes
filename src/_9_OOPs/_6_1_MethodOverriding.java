package _9_OOPs;

class Animal {
	public void move() {
		System.out.println("Animals can move");
	}
}

class Dog_6_1 extends Animal {
	public void move() {
		System.out.println("Dog_6_1s can walk and run");
	}
}

public class _6_1_MethodOverriding {

	public static void main(String args[]) {
		Animal a = new Animal(); // Animal reference and object
		Animal b = new Dog_6_1(); // Animal reference but Dog_6_1 object

		a.move(); // runs the method in Animal class
		b.move(); // runs the method in Dog_6_1 class
	}
}