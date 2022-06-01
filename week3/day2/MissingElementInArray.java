package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInArray {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		int[] data = {2,3,4,10,6,7,9};
		//converting the integer array data to ArrayList using for loop
		for (int i = 0; i < data.length; i++) {
			arr.add(i, data[i]);
		}
		//sorting the ArrayList using Collections
		Collections.sort(arr);
		//Printing the actual arraylist contents
		System.out.println(arr);
		//initialize a counter with value 1
		int count =1;
		for (int i = 0; i < data.length; i++) {
			//check if the value of arraylist and count are not equal
			if(arr.get(i)!=count) {
				System.out.println("The missing number is "+count);//5
			}
			//to increment the counter we are adding 1 to arraylist value of that index  	   
			count=arr.get(i) +1;

		}

	}

}
