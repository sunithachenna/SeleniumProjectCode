package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacters {
 public static void main(String[] args) {
	 // take the input string
	 String input = "babu";
	 //convert it to character array
	 char[] charArray = input.toCharArray();
	 //create a set object
	 Set<Character> ch = new HashSet<Character>();
	 //iterate to check for duplicates and remove from the set
	 for (int i = 0; i < charArray.length; i++) {
		 if (!ch.add(charArray[i])) {
			 ch.remove(charArray[i]);
		 }
	 }	 
	 //print the array
	 System.out.println(ch);
}
}
