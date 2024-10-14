package _9_OOPs;

class SuperTester {
	SuperTester() {
		System.out.println("Inside super constructor");
	}
}

public class _10_2_InstanceInitializerBlock extends SuperTester {
	int a;
	{
		System.out.println("Inside instance initializer block");
		a = 10;
	}

	_10_2_InstanceInitializerBlock() {
		System.out.println("Inside constructor");
	}

	public static void main(String[] arguments) {
		_10_2_InstanceInitializerBlock test = new _10_2_InstanceInitializerBlock();
		System.out.println("Value of a: " + test.a);
	}
}