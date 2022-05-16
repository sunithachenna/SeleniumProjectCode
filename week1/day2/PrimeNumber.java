package week1.day2;

public class PrimeNumber {
	public static void main(String[] args) {
		int input = 13;
		boolean flag = false;
		 for (int i=2;i<input/2;i++)
		 {
			 if (input%2==0) {
				 flag = true;
				 break;
			 }
		 }
		 if (flag==false)
		 {
			 System.out.println( " It is a Prime number");
		 } else
		 {
			 System.out.println(" It is a not prime number");
		 }

	}
}
