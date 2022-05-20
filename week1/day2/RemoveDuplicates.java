package week1.day2;

import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";

		// split the string to form an array based on the spaces
		String[] array = text.split(" ");

		for (int i = 0; i < array.length; i++) {

			for (int j = i+1; j < array.length; j++) {
				//Check every word for the duplicates without being case sensitive				
				if (array[i].equalsIgnoreCase(array[j]))
				{
					// if there is a duplicate replace it with " ".
					// Here it is not array[i], but array[j] as the duplicates alone have to be removed and not everything.					
					array[j]=" ";
				}
			}
			//For readability we have added space and displayed without "\n".			
			System.out.print(" " +array[i]);	
		}

	}
}

// -------------------- with counter----------------------------------------------------------
package week1.day2;

import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		// Initialise a counter to check the duplicates
		int count =1;
		// split the string to form an array based on the spaces
		String[] array = text.split(" ");

		for (int i = 0; i < array.length; i++) {

			for (int j = i+1; j < array.length; j++) {
				//Check every word for the duplicates without being case sensitive				
				if (array[i].equalsIgnoreCase(array[j]))
				{
					// when duplicates are present increment the counter
					count+=1;
					// only when the counter is greater than 1, we will replace the duplicate
					if (count >1)
						// if there is a duplicate replace it with " ".
						// Here it is not array[i], but array[j] as the duplicates alone have to be removed and not everything.					
						array[j]=" ";
				}
			}
			//For readability we have added space and displayed without "\n".	
			System.out.print(" " +array[i]);	
		}

	}
}






