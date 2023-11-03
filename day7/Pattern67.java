package day7;

public class Pattern67 {
/*
E 
E D 
E D C 
E D C B 
E D C B A 

*/
	public Pattern67(int n) {
		char ch = 65;
		for(int row=n-1; row>=0; row--) {
			
			for(int column=n-1; column>=row; column--) {
				System.out.print((char)(column+ch)+ " ");
				
			}
			
			System.out.println();
		}
	}

}
