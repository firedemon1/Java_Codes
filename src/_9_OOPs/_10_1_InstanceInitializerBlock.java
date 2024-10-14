package _9_OOPs;

public class _10_1_InstanceInitializerBlock {
	int a;
	{
		System.out.println("Inside instance initializer block");
		a = 10;
	}

	_10_1_InstanceInitializerBlock() {
		System.out.println("Inside constructor");
		a = 20;
	}

	public static void main(String[] arguments) {
		_10_1_InstanceInitializerBlock test = new _10_1_InstanceInitializerBlock();
		System.out.println("Value of a: " + test.a);
	}
}