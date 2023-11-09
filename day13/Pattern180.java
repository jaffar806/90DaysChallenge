package day13;

public class Pattern180 {
/*
     *
    **
   ***
  ****
 *****
******
 *****
  ****
   ***
    **
     *

*/
	public Pattern180(int n) {
		for(int row=n; row>=-n; row--) {
			for(int s=1; s<=Math.abs(row); s++) {
				System.out.print(" ");
			}for(int column=n; column>=Math.abs(row); column--) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}

}
