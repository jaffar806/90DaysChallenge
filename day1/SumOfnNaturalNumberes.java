package day1;

import java.util.Scanner;

public class SumOfnNaturalNumberes {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = number.nextInt();
		
		int sum = 0;
		for(int i = 0; i <= n; i++) {
			sum = sum + i;
		}System.out.println("Sum of N natural numbers are: "+sum);
	}

}
