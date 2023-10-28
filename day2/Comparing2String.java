package day2;

import java.util.Scanner;

public class Comparing2String {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String name1 = input.next();
        System.out.print("Enter the second String: ");
        String name2 = input.next();
        
        System.out.println(name1.compareTo(name2));
        System.out.println(name1.compareToIgnoreCase(name2));
        System.out.println(name1.endsWith(name2));
        System.out.println(name1 == name2);
        System.out.println(name1.equalsIgnoreCase(name2));       
 	}

}


