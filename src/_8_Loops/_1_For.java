package _8_Loops;

public class _1_For {

	public static void main(String args[]) {

		for (int x = 10; x < 20; x = x + 1) {
			System.out.print("value of x : " + x);
			System.out.print("\n");
		}

		int[] numbers = { 10, 20, 30, 40, 50 };

		for (int index = 0; index < numbers.length; index++) {
			System.out.print("value of item : " + numbers[index]);
			System.out.print("\n");
		}
	}
}
