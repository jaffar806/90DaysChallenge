package day13;

public class Pattern184 {
/*
       D
     D C
   D C B
 D C B A
   D C B
     D C
       D

*/
	public Pattern184(int n) {
		char ch=65;
        for(int row=n; row>=-n; row--) {
        	for(int s=1; s<=Math.abs(row); s++) {
        		System.out.print("  ");
        	}for(int column=n; column>=Math.abs(row); column--) {
        		System.out.printf("%2c", column+ch);
        	}
        	System.out.println();
        }
	}

}
