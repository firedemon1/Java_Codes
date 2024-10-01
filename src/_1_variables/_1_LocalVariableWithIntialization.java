package _1_variables;

public class _1_LocalVariableWithIntialization {
	public void pupAge() {
		int age = 0;
		age = age + 7;
		System.out.println("Puppy age is : " + age);
	}

	public static void main(String args[]) {
		_1_LocalVariableWithIntialization test = new _1_LocalVariableWithIntialization();
		test.pupAge();
	}
}
