package day7;

public class Pattern88 {
/*
A B C D E 
A B C D 
A B C 
A B 
A 
  
*/
	public Pattern88(int n) {
		char ch= 65; 
		for(int row=n; row>0; row--) {
			for(int column=0; column<row; column++) {
				System.out.print((char)(column+ch)+ " ");
			}
			System.out.println();
		}
	}

}
