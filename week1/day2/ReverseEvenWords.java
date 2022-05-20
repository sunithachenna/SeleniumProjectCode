package week1.day2;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		//converting the string into an array with space as the seperator
        String[] stringArray = test.split(" ");
        // to check if the index of the string is even
        for (int i = 0; i < stringArray.length; i++) {
        	if (i%2!=0) 
			{
				//if the array index is even then print the characters of the word in reverse order.
				for (int j = (stringArray[i].length()-1); j >= 0; j--) {
					// getting the last char first from the string array
					System.out.print(stringArray[i].charAt(j));
					
				}
				
			} else
				//if the index is not even then simply display the contents of the array
				System.out.print(stringArray[i]);
			System.out.print(" ");
		}
	}

}
