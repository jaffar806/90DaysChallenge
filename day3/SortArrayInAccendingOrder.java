package day3;

import java.util.Arrays;

public class SortArrayInAccendingOrder {

	public static void main(String[] args) {
   
	int[] array = {65,85,411,2,74,5,36,-1,45,22,0,-2};
	Arrays.sort(array);  //array is sorted using sort method in Array class
    
	System.out.println("Before sorted Elements are: [65,85,411,2,74,5,36,-1,45,22,0,-2]");
	
	System.err.print("Array elements are now sorted: ");
    System.out.print("[");
	for(int i = 0; i<array.length; i++) {
		System.out.print(array[i]+ ",");
	}
	   System.out.print("]");
	   
	   System.out.println("\nWe used to String method to print in ascending order: ");  //this method print arraylist elements in ascending order
	   System.out.println(Arrays.toString(array));
	   
	}

	
}
