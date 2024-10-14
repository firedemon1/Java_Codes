package _9_OOPs;

class One1 {
	public void printOne() {
		System.out.println("printOne() method of One class.");
	}
}

class Two extends One1 {
	public void printTwo() {
		System.out.println("printTwo() method of Two class.");
	}
}

public class _3_2_MutiLevelInheritance extends Two {
	public static void main(String args[]) {
		// Creating object of the derived class (Main)
		_3_2_MutiLevelInheritance obj = new _3_2_MutiLevelInheritance();

		// Calling methods
		obj.printOne();
		obj.printTwo();
	}
}