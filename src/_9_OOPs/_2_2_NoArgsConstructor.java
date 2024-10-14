package _9_OOPs;

public class _2_2_NoArgsConstructor {
	int num1;
	int num2;

	// Creating no-args constructor
	_2_2_NoArgsConstructor() {
		num1 = -1;
		num2 = -1;
	}

	public static void main(String[] args) {
		// no-args constructor will invoke
		_2_2_NoArgsConstructor obj_x = new _2_2_NoArgsConstructor();

		// Printing the values
		System.out.println("num1 : " + obj_x.num1);
		System.out.println("num2 : " + obj_x.num2);
	}
}