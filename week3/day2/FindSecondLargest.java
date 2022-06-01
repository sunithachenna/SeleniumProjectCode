package week3.day2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import net.bytebuddy.agent.builder.AgentBuilder.Transformer.ForAdvice;

public class FindSecondLargest {
	//-------------Using Lists and then sorting using Collections
	public static void main(String[] args) { 
		//Intializing an Array List
		ArrayList<Integer> arr = new  ArrayList<Integer>();
		//Input array
		int[] data1 = {3,2,11,4,6,7};
		//loop over the data and add to the ArrayList
		for (int i = 0; i < data1.length; i++) { 
			arr.add(i, data1[i]);
		}
		//Using Collections to sort in reverse order
		Collections.sort(arr);
		Collections.reverse(arr);
		System.out.println("The Second largest number in the list is : "+arr.get(1));
 
}
}
