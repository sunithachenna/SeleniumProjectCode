package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWithSet {
	public static void main(String[] args) {
		//initialize a string variable with data
		String text = "We learn java basics as part of java sessions in java week1";
		//create a set object to check in the same order enter with LinkedHashSet
		Set<String> array = new LinkedHashSet<String>();
		//initialize a counter
		int count=0;
		//create a string array by spliting the string
		String[] arrayString = text.split(" ");
		//add the elements into the string array
		for (int i = 0; i < arrayString.length; i++) {
			array.add(arrayString[i]);
			
		}
		//print array
		System.out.println(array);
	}

}
