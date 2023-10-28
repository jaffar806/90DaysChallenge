package day1;

import java.util.Scanner;

public class OddNumberUsingWhileLoop {

	public static void main(String[] args) {
	Scanner number = new Scanner(System.in);
	System.out.print("Enter any number: ");
	int num = number.nextInt();
	int i =1;
	System.out.print("odd numbers are:");
	while(i <= num) {
		if(i%2 !=0 ) {
			System.out.print(i+ ",");
		}
		i++;
}	
	}
	

}
