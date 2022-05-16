package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input=153;
		int cal = 0;
		int original= input;
		int rem;
		
		while (input>0)
		{
			rem= input%10; //3
			input=input/10; //15
			cal=cal +(rem*rem*rem);
		}
        if (cal==original) {
        	System.out.println("It is an Armstrong number "+cal);
        } else {
        	System.out.println("It is not an Armstrong number "+cal);
        }
	}

}
