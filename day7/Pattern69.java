package day7;

public class Pattern69 {
/*

A 
B A 
C B A 
D C B A 
E D C B A 

*/
	public Pattern69(int n) {
		char ch = 65;
		for(int row=0; row<n; row++) {
			
			for(int column=row; column>=0; column--) {
				System.out.print((char)(ch+column)+ " ");		
			}
			
			System.out.println();
		}
	}

}
