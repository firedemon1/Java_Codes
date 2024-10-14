package _9_OOPs;

public class _11_2_AbstractMethod {
	public static void main(String[] args) {
		Salary_11_2 s = new Salary_11_2("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
		System.out.println("Salary_11_2: " + s.computePay());
	}
}

abstract class Employee_11_2 {
	private String name;
	private String address;
	private int number;

	public Employee_11_2(String name, String address, int number) {
		System.out.println("Constructing an Employee_11_2");
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public abstract double computePay();
	// Remainder of class definition

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}

class Salary_11_2 extends Employee_11_2 {
	private double Salary_11_2; // Annual Salary_11_2

	public Salary_11_2(String name, String address, int number, double Salary_11_2) {
		super(name, address, number);
		this.Salary_11_2 = Salary_11_2;
	}

	public double computePay() {
		System.out.println("Computing Salary_11_2 pay for " + getName());
		return Salary_11_2 / 52;
	}
	// Remainder of class definition
}