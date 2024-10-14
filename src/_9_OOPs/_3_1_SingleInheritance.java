package _9_OOPs;

class One {
	public void printOne() {
		System.out.println("printOne() method of One class.");
	}
}

public class _3_1_SingleInheritance extends One {
	public static void main(String args[]) {
		// Creating object of the derived class (Main)
		_3_1_SingleInheritance obj = new _3_1_SingleInheritance();

		// Calling method
		obj.printOne();
	}
}