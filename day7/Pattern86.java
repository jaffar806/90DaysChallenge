package day7;

public class Pattern86 {
/*
1 0 1 0 1 
0 1 0 1 
1 0 1 
0 1 
1 

*/
	public Pattern86(int n) {
		 for(int row=n; row>0; row--) {
			 for(int column=0; column<row; column++) {
				 System.out.print((row+column)%2+ " ");
			 }
			 System.out.println();
		 }
	}

}
