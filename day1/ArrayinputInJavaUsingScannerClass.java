package day1;

import java.util.Scanner;

public class ArrayinputInJavaUsingScannerClass {

	public static void main(String[] args) {
		int[] num = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("enter the numbers: ");
		
		
		for(int i =0; i<5; i++) { //this for loop will store the elements
			num[i] = input.nextInt();	
		}
		System.out.print("Array elements are: ");
		
		for(int i=0; i<5; i++) { //this for loop will print the elements of an array
			System.out.print(num[i]+ ",");
		}
		System.out.println("\nLength of an array is: "+num.length);

	}

}
