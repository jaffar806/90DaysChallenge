package day12;

public class Pattern163 {
/*
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 

*/
	public Pattern163(int n) {
		int ts= 2*n-1;
		for(int row=n; row>=1; row--) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("  ");
			}for(int column=1; column<=ts; column++) {
				System.out.printf("* ");
			}
			System.out.println();
			ts=ts-2;
		}
		
	}

}
