package day1;

import java.util.Scanner;

public class SumOdEvenDigitForLoop {

	public static void main(String[] args) {
		System.out.println("Enter till what number you want sum of even: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int sum =0;
		for (int i=1; i<=number; i++) {
			
			if(i%2 == 0) {
				sum = sum + i;
			}
		}System.out.println("Sum of the Even numbers are: "+sum);
		

	}

}
