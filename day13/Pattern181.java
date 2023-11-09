package day13;

public class Pattern181 {
/*
       3
     3 2
   3 2 1
 3 2 1 0
   3 2 1
     3 2
       3

*/
	public Pattern181(int n) {
		for(int row=n; row>=-n; row--) {
			for(int s=1; s<=Math.abs(row); s++) {
				System.out.print("  ");
			}for(int column=n; column>=Math.abs(row); column--) {
				System.out.printf("%2d", column);
			}
			System.out.println();
		}
	}

}
