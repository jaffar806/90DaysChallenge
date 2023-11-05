package day9;

public class Pattern117 {
/*
 * 
*****
 ****
  ***
   **
    *

*/
	public Pattern117(int n) {
		for(int row=0; row<n; row++) {
			for(int s=1; s<=row; s++) {
				System.out.print(" ");
			}for(int column=n; column>row; column--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
