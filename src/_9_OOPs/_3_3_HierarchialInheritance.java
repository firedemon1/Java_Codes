package _9_OOPs;

//Base class
class One2 {
	public void printOne() {
		System.out.println("printOne() Method of Class One");
	}
}

//Derived class 1
class Two2 extends One2 {
	public void printTwo() {
		System.out.println("Two() Method of Class Two");
	}
}

//Derived class 2
class Three extends One2 {
	public void printThree() {
		System.out.println("printThree() Method of Class Three");
	}
}

//Testing CLass
public class _3_3_HierarchialInheritance {
	public static void main(String args[]) {
		Two2 obj1 = new Two2();
		Three obj2 = new Three();

		// All classes can access the method of class One
		obj1.printOne();
		obj2.printOne();
	}
}