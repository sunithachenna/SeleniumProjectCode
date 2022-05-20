package week1.day2;

import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";

		// split the string to form an array based on the spaces
		String[] array = text.split(" ");
		// take a counter to increment if matches
		int count=0;
		for (int i = 0; i < array.length; i++) {//3
			for (int j = i+1; j < array.length; j++) {//8
				if (array[i].equalsIgnoreCase(array[j]))
				{
					count = count +1;
				}
			}
			if (count>1)
			{
				String replace =text.replace(array[i], " ");
				//String replace = text.replaceAll(array[i], " ");
				System.out.println(replace);
				break;
			}	 
		}
	}
}










