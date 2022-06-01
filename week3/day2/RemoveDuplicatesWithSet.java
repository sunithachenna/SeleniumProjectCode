package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWithSet {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		Set<String> array = new LinkedHashSet<String>();
		
		int count=0;
		String[] arrayString = text.split(" ");
		for (int i = 0; i < arrayString.length; i++) {
			array.add(arrayString[i]);
			
		}
		System.out.println(array);
	}

}
