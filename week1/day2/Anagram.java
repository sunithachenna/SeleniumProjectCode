package week1.day2;
import java.util.Arrays;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		// initialize a counter to check
		int count = 0;
		//Check if both the string length are same
		if (text1.length()==text2.length()) {
			System.out.println("The length of Strings are same");
			// convert both strings to char arrays
			char[] charArrayText1 = text1.toCharArray();
			char[] charArrayText2 = text2.toCharArray();
			//sort the array to check if they have same value
			for (int i = 0; i < charArrayText1.length; i++) {
				for (int j = 0; j < charArrayText2.length; j++) {
					// if the value of first array is present in the second array, increment the count and exit the loop
					if (charArrayText1[i]==charArrayText2[j]) {
						count ++;
						break;
					} 
				}
			}
			// check if the count of matches is same as the length of the string, if yes it is a Anagram
			if (count == text1.length())	{
				System.out.println("It is an Anagram");
			} else
			{
				System.out.println("It is not an Anagram");
			}	
		} else {
			System.out.println("Length of the Strings are different ");
		}
  }
}
