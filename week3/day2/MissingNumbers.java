package week3.day2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumbers {
	public static void main(String[] args) {
		int[] numbers = {4,6,7,2,3,1,9,10,8,8,6,2};
		//taking Set interface to remove duplicates and treeset to arrange in ascending order
		Set<Integer> arr = new TreeSet<Integer>();

		for (int i = 0; i < numbers.length; i++) {
			arr.add(numbers[i]);
		}
		//initializing a counter
		int count=1;
		//checking if the counter value exists in the setarray
		for (int i = 0; i < arr.size(); i++) {
			if(arr.contains(count)) {
				//if yes increment the counter
				count= count+1;

			} else {
				//print the missing number and increment the counter
				System.out.println("The number missing is "+count);
				count=count+1;
			}

		}

	}
}
