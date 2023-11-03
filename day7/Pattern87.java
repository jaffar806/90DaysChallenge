package day7;

public class Pattern87 {
/*
A A A A A 
B B B B 
C C C 
D D 
E 

*/
	public Pattern87(int n) {
		char ch=65;
		for(int row=0; row<n; row++) {
			for(int column=n; column>row; column--) {
				System.out.print((char)(ch+row)+ " ");
			}
			System.out.println();
		}
	}

}
