package _9_OOPs;

public class _2_3_Parameterized_Constructor {
	int num1;
	int num2;

	// Creating parameterized constructor
	_2_3_Parameterized_Constructor(int a, int b) {
		num1 = a;
		num2 = b;
	}

	public static void main(String[] args) {
		// Creating two objects by passing the values
		// to initialize the attributes.
		// parameterized constructor will invoke
		_2_3_Parameterized_Constructor obj_x = new _2_3_Parameterized_Constructor(10, 20);
		_2_3_Parameterized_Constructor obj_y = new _2_3_Parameterized_Constructor(100, 200);

		// Printing the objects values
		System.out.println("obj_x");
		System.out.println("num1 : " + obj_x.num1);
		System.out.println("num2 : " + obj_x.num2);

		System.out.println("obj_y");
		System.out.println("num1 : " + obj_y.num1);
		System.out.println("num2 : " + obj_y.num2);
	}
}