package _5_UserInput;

import java.util.Scanner;

public class _1_Scanner {
	public static void main(String[] args) {
		// Creating an object of Scanner class
		Scanner sc = new Scanner(System.in);

		// Reading an Integer Input
		System.out.print("Input an integer value: ");
		int int_num = sc.nextInt();
		System.out.println("The input is : " + int_num);

		// Reading a Float Input
		System.out.print("Input a float value: ");
		float float_num = sc.nextFloat();
		System.out.println("The input is : " + float_num);

		// Reading a String Input
		System.out.print("Input a string value: ");
		String str = sc.nextLine();
		System.out.print("The input is : " + str);

	}
}