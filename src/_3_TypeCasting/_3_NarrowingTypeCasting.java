package _3_TypeCasting;

//Narrowing type casting is also known as explicit type casting or explicit type conversion
public class _3_NarrowingTypeCasting {
	public static void main(String[] args) {
		int num = 5004;
		// Type casting int to double
		double doubleNum = (double) num;
		doubleNum += 0.1;
		System.out.println("The value of " + num + " after converting to the double is " + doubleNum);
		// Type casting double to int
		int convertedInt = (int) doubleNum;
		System.out.println("The value of " + doubleNum + " after converting to the int again is " + convertedInt);
	}
}