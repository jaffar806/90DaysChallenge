package day10;

public class Pattern139 {
/*
    *
   ***
  *****
 *******
*********
 

*/
	public Pattern139(int n) {
		int k=0;
		for(int row=1; row<=n; row++) {
			for(int s=n-1; s>=row; s--) {
				System.out.print(" ");
			}for(int column=1; column<=row+k; column++) {
				System.out.print("*");
			}
			k++;
			System.out.println();
		}
	
		}
	}



