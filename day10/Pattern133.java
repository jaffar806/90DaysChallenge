package day10;

public class Pattern133 {
/*
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 

*/
	public Pattern133(int n) {
		 for(int row=n; row>0; row--) {
			 for(int s=n-1; s>=row; s--) {
				 System.out.print(" ");
			 }for(int column=1; column<=row; column++) {
				 System.out.print("* ");
			 }System.out.println(); 
		 }for(int row=2; row<=n; row++) { //row=2 because i don't want row1 (row2 contain 2 stars and row1 contain 1)
			 for(int s=n-1; s>=row; s--) {
				 System.out.print(" ");
			 }for(int column=1; column<=row; column++) {
					 System.out.print("* ");
				}
			 System.out.println(); 	 
			 }
	}

}
