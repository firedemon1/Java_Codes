package _9_OOPs;

class Animal_8 {
	public void move() {
		System.out.println("Animal_8s can move");
	}
}

class Dog_8 extends Animal_8 {
	public void move() {
		System.out.println("Dog_8s can walk and run");
	}
}

public class _8_DynamicBinding {

	public static void main(String args[]) {
		Animal_8 a = new Animal_8(); // Animal_8 reference and object
		// Dynamic Binding
		Animal_8 b = new Dog_8(); // Animal_8 reference but Dog_8 object

		a.move(); // runs the method in Animal_8 class
		b.move(); // runs the method in Dog_8 class
	}
}