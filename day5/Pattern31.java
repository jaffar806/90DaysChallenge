package day5;

public class Pattern31 {
/*
A B C D E 
B C D E F 
C D E F G 
D E F G H 
E F G H I 
*/
	public Pattern31(int n) {
		 char ch =65;
		 for(int row=0; row<n; row++) {
			 for(int column=0; column<n; column++) {
				 System.out.print((char)(row+column+ch)+ " "); 
			 }
			 System.out.println();
		 }
	}

}
