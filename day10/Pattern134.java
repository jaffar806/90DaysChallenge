package day10;

public class Pattern134 {
/*
 
5 5 5 5 5 
 4 4 4 4 
  3 3 3 
   2 2 
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 

*/
	public Pattern134(int n) {
		for(int row=n; row>0; row--) {
			 for(int s=n-1; s>=row; s--) {
				 System.out.print(" ");
			 }for(int column=1; column<=row; column++) {
				 System.out.print(row+" ");
			 }System.out.println(); 
		}for(int row=2; row<=n; row++) {
			for(int s=n-1; s>=row; s--) {
				System.out.print(" ");
			}for(int column=1; column<=row; column++) {
				System.out.print(row+ " ");
			}
			System.out.println();
		}
	}
}
