package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		String test = "feeling good";
		int length = test.length();

		char[] charArray = test.toCharArray();

		for (int i=length; i>0; i--) {

			System.out.print(charArray[i-1]);
		}
		//____________________
		////OR Second code
		//_____________________

		//just to print the second code in the next line using syso	
		System.out.println(" ");
		for (int i= length-1; i>0;i--)
		{
			System.out.print(test.charAt(i));
		}
	}

}
