package week1.day2;

import java.util.Iterator;

public class Palindrome {
	public static void main(String[] args) {
		String str = "MAdam";

		// convert string to char array
		char[] charArray = str.toCharArray();

		// initializing a variable to assign to the array
		int j=0;

		//length of the string
		int length = str.length();

		//taking the values from reverse order
		for (int i = length-1; i >=0; i--)
		{
			//send the last char of the string to first index of char array
			charArray[j] = str.charAt(i);

			j=j+1;
		}

		//converting the char array to String
		String rev = new String(charArray);

		//Comparing the strings to see if it is Palindrome
		if (rev.equalsIgnoreCase(str))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
