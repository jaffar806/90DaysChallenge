package day7;

public class Pattern68 {
/*
 * 
E 
D D 
C C C 
B B B B 
A A A A A 

*/
	public Pattern68(int n) {
		char ch = 65;
		for(int row=n-1; row>=0; row--) {
			
			for(int column=n-1; column>=row; column--) {
				System.out.print((char)(row+ch)+ " ");
				
				
			}
			
			System.out.println();
		}
	}

}
