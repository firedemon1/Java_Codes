package _9_OOPs;

public class _2_1_DefaultConstructor {
	int num1;
	int num2;

	public static void main(String[] args) {
		// We didn't created any structure
		// a default constructor will invoke here
		_2_1_DefaultConstructor obj_x = new _2_1_DefaultConstructor();

		// Printing the values
		System.out.println("num1 : " + obj_x.num1);
		System.out.println("num2 : " + obj_x.num2);
	}
}