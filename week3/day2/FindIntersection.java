package week3.day2;
import java.util.ArrayList;
import java.util.List;
public class FindIntersection {
	public static void main(String[] args) {
		//create an ArrayList to store the intersection values
		List<Integer> array = new ArrayList<Integer>();
		//Initialize two arrays
		int[] array1 = {3,2,11,4,6,7};
		int[] array2 = {1,2,8,4,9,7};
        // iterate through the array to get only the intersection values
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
        // If the values are same in both arrays then add them to the ArrayList
				if (array1[i]==array2[j])
					array.add(array1[i]);
			}
		}
		System.out.println(array);
	}
}

