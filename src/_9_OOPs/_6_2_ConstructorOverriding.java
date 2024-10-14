package _9_OOPs;

class Animal_6_2 {
	public void move() {
		System.out.println("Animal_6_2s can move");
	}
}

class Dog_6_2 extends Animal_6_2 {
	public void move() {
		super.move(); // invokes the super class method
		System.out.println("Dog_6_2s can walk and run");
	}
}

public class _6_2_ConstructorOverriding {

	public static void main(String args[]) {
		Animal_6_2 b = new Dog_6_2(); // Animal_6_2 reference but Dog_6_2 object
		b.move(); // runs the method in Dog_6_2 class
	}
}