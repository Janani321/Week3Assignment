package week3.day2;

import java.util.LinkedList;
import java.util.List;
public class IntersectionOfArrays {

public static void main(String[] args) {
		
	int[] array1 = {3, 2, 11, 4, 6, 7};
	int[] array2 = {1, 2, 8, 4, 9, 7};

// Convert arrays to lists
   List<Integer> list1 = new LinkedList<Integer>();
   List<Integer> list2 = new LinkedList<Integer>();
   
// Convert the array1 values to list1
   for(int num : array1) {
	   list1.add(num);
   }

// Convert the array2 values to list2
   for(int num : array2) {
	   list2.add(num);
   }

// Find the intersection
   List<Integer> intersection  = new LinkedList<Integer>(list1);
   intersection.retainAll(list2);

// Print the intersection
   System.out.println(intersection);
	}
}
