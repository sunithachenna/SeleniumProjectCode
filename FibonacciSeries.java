package week1.day1;

public class FibonacciSeries {
	/*
	 * Goal: To find Fibonacci Series for a given range
	 */
	public static void main(String[] args) {
		int a=0 ;
		int b=1 ;
		int sum=0;
		System.out.print(a);
		for (int i = 1; i < 8; i++) {
			a=b;
			b=sum;
			sum=a+b;
			System.out.print(" "+sum);
		}
	}

}
