package day12;

public class Pattern168 {
/*
 I I I I I I I I I
   G G G G G G G
     E E E E E
       C C C
         A

*/
	public Pattern168(int n) {
		int ts=2*n-1; 
		char ch=64;
		for(int row=n; row>=1; row--) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("  ");
			}for(int column=1; column<=ts; column++) {
				System.out.printf("%2c", ch+ts);
			}
			System.out.println();
			ts=ts-2;
		}
	}

}
