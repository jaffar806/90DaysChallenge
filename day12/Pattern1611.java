package day12;

public class Pattern1611 {
/*
         A
       A B A
     A B C B A
   A B C D C B A
 A B C D E D C B A

*/
	public Pattern1611(int n) {
		
		char ch=65;
		for(int row=0; row<n; row++) {
			for(int s=n-1; s>row; s--) {
				System.out.print("  ");
			}for(int column=row; column>=-row; column--) {
				System.out.printf("%2c",(row-Math.abs(column)+ch ));
			}
			System.out.println();
			
		}
	}

}
