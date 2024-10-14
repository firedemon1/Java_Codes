package _8_Loops;

public class _3_While {

	public static void main(String args[]) {
		int x = 10;

		while (x < 20) {
			System.out.print("value of x : " + x);
			x++;
			System.out.print("\n");
		}
		System.out.println();

		int[] numbers = { 10, 20, 30, 40, 50 };
		int index = 0;

		while (index < 5) {
			System.out.print("value of item : " + numbers[index]);
			index++;
			System.out.print("\n");
		}
		System.out.println();

		x = 10;

//		while (true) {
//			System.out.print("value of x : " + x);
//			x++;
//			System.out.print("\n");
//		}
	}
}