package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacters {
 public static void main(String[] args) {
	 String input = "babu";
	 char[] charArray = input.toCharArray();
	 Set<Character> ch = new HashSet<Character>();
	 for (int i = 0; i < charArray.length; i++) {
		 if (!ch.add(charArray[i])) {
			 ch.remove(charArray[i]);
		 }
	 }	 
	 System.out.println(ch);
}
}
