package _8_Loops;

public class _4_DoWhile {

	public static void main(String args[]) {
		int x = 10;

		do {
			System.out.print("value of x : " + x);
			x++;
			System.out.print("\n");
		} while (x < 20);
		System.out.println();

		int[] numbers = { 10, 20, 30, 40, 50 };
		int index = 0;

		do {
			System.out.print("value of item : " + numbers[index]);
			index++;
			System.out.print("\n");
		} while (index < 5);
		System.out.println();

		x = 10;

//		do {
//			System.out.print("value of x : " + x);
//			x++;
//			System.out.print("\n");
//		} while (true);
	}
}