package week1.day2;

public class Calculator {
	public int add(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	public double sub(double a, double b)
	{
		double diff = a-b;
		return diff;
	}
	public double mul(double a, double b)
	{
		double result = a*b;
		return result;
	}
	public int div(int a, int b)
	{
		int quotient = a/b;
		return quotient;
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println("Result of Addition is : "+cal.add(5, 5));
		System.out.println("Result of Subtraction is: "+cal.sub(8.5, 6.7));
		System.out.println("Result of Multiplication is : "+cal.mul(9.0, 9.4));
		System.out.println("Result of Division is : "+cal.div(10, 5));
	}
}
