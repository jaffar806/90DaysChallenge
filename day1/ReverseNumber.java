package day1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
	 System.out.println("Enter any number to reverse: ");
	 
	 Scanner input = new Scanner(System.in);
	 int num = input.nextInt();
	 
	 System.out.println("Actual number is: "+num);
	 int remainder, reverse =0;
	 while(num != 0) {
		 remainder = num%10;
		 reverse = reverse *10 +remainder;
		 num =num/10;
	 }
	 System.out.println("Reversed number is: "+reverse);
	 

	}

}
