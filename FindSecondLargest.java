package week3.day6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
/*
 * int[] data = {3,2,11,4,6,7};

		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
 
	public static void main(String[] args) {
		Integer[] data = {3,2,11,4,6,7};
		
	int len = data.length;
		List<Integer> list=Arrays.asList(data); 
		
	
		Collections.sort(list);  
		int element=list.get(len-2);  
		
		System.out.println("Second Largest Element is = "+element);
		
		
	}

}
