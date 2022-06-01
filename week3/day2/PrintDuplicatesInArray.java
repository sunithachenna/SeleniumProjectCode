package week3.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		//initialize a integer array
		int[] data = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		//create an object form list array
		List<Integer> arr = new ArrayList<Integer>();
		//add elements to the List array
		for (int i = 0; i < data.length; i++) {
			arr.add(i, data[i]);
		}
		//initialize a counter
		int count;
		// iterate to check for duplicates, if yes then increment the counter
		for (int i = 0; i < arr.size()-1; i++) {
			count =0;
			for (int j = i+1; j < arr.size(); j++) {
				if (arr.get(i)==arr.get(j)) {
					count++;
				}
			}
			if (count>0) {
			System.out.println(arr.get(i));
			}
		}
	}

}
