package week1.day2;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class SumOfDigitsFromString {
	public static void main(String[] args) {
		//Declare a String text with the following value
		String text = "Tes12Le79af65";
		//Declare a int variable sum
		int sum = 0;
		for (int i = 0; i < text.length(); i++) {
			//check if the character at that index is a digit
			boolean digit = Character.isDigit(text.charAt(i));
			if (digit)
			{
				// convert the digit character to its numericvalue using Character.getNumericValue()
				int numericValue = Character.getNumericValue(text.charAt(i));
				//sum the values of the digit
				sum= sum+numericValue;
			}
		}
		System.out.println(sum);

	}

}
