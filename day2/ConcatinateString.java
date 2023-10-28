package day2;

import java.util.Scanner;

public class ConcatinateString {
	//String has concat method, remember string is immutable.
	//It adds a string to another string.
	//It will create the new object after concatenation done, since it is a immutable

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your name: ");
    
    String name = input.next();
    
    System.out.println(name.concat(" will become software developer"));

	}

}
