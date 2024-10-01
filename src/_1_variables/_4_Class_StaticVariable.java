package _1_variables;

import java.io.*;

public class _4_Class_StaticVariable {

	// salary variable is a private static variable
	private static double salary;

	// DEPARTMENT is a constant
	public static final String DEPARTMENT = "Development ";

	public static void main(String args[]) {
		salary = 1000;
		System.out.println(DEPARTMENT + "average salary:" + salary);
	}
}