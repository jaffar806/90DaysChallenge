package day10;

public class Pattern128 {
/*
    * 
   * * 
  * * * 
 * * * * 
* * * * * 


*/
	public Pattern128(int n) {
		for(int row=1; row<=n; row++) {
			for(int s=n-1; s>=row; s--) {
				System.out.print(" "); //with out space it print right half pyramid
			}for(int column=1;column<=row; column++) {
				System.out.print("* "); //without space it print left half pyramid
			}
			System.out.println();  //in abouve line if we write space it print triangle
		}
	}

}
