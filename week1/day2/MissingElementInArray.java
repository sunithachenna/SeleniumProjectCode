package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		//int [] arr = {0,1,2,3,4,5,6,7,9,10,11};
		Arrays.sort(arr);
		int j=0;
		for (int i=arr[0];i<arr.length;i++)
		{
			
		if (arr[j]!=i) {
			System.out.println("Missing element in the array is "+i);
			break;
		}
		j=j+1;
	}

}
}
