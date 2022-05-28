package week3.day1;

public class Calculator {
	public int add(int a, int b) {
		int sum= a+b;
		return sum;
	}
	public int add(int a, int b, int c) {
		int sum= a+b+c;
		return sum;
	}
	public int sub(int a, int b) {
		int diff = a-b;
		return diff;
	}
	public double sub (double a, double b) {
		double diff= a-b;
		return diff;
	}
	public int multiply (int a, int b) {
		int product=a*b;
		return product;
	}
	public double multiply (double a, int b) {
		double product= a*b;
		return product;
	}

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		System.out.println("Addition with 2 int" +myCal.add(5, 5));
		System.out.println("Addition with 3 integer: "+myCal.add(5, 5, 5));
		System.out.println("Subtraction with 2 integers: "+myCal.sub(10, 5));
		System.out.println("Subtraction with 2 double: "+myCal.sub(10.9, 5.5));
		System.out.println("Multiplication with 2 intergers: "+myCal.multiply(12, 12));
		System.out.println("Multiplication with 1 double and 1 int: " +myCal.multiply(5.5, 5));

	}

}
