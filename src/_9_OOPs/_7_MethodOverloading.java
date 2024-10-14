package _9_OOPs;

class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public double add(double a, double b) {
		return a + b;
	}
}

public class _7_MethodOverloading {
	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(20, 40));
		System.out.println(calculator.add(40, 50, 60));
		System.out.println(calculator.add(20.0, 40.0));
	}
}