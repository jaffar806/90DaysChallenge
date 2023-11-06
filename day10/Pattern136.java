package day10;

public class Pattern136 {
/*	E E E E E 
	 D D D D 
	  C C C 
	   B B 
	    A 
*/
	public Pattern136(int n) {
		char ch=65;
		for(int row=n-1; row>=0; row--) {
			for(int s=n-1; s>row; s--) {
				System.out.print(" ");
			}for(int column=0; column<=row; column++) {
				System.out.print((char)(ch+row)+ " ");
			}
			
			System.out.println();
			
		}
	}

}
