package _11_Exceptions;

public class _6_BuiltInException {

	public static void main(String args[]) {
		try {
			int b = 0;
			int c = 1 / b;
			System.out.println("c :" + c);
		} catch (ArithmeticException e) {
			System.out.println("Exception thrown  :" + e);
		}
		System.out.println("Out of the block");
	}
}