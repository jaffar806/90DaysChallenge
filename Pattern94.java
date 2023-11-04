package day8;

public class Pattern94 {
/*
A 
B C 
D E F 
G H I J 
K L M N O 

*/
	public Pattern94(int n) {
		char ch= 65;
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=row; column++) {
				System.out.print((char)ch+ " ");
				ch++;
			}
			System.out.println();
		}
	}

}
