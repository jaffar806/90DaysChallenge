package day13;

public class Pattern182 {
/*
       3
     2 3
   1 2 3
 0 1 2 3
   1 2 3
     2 3
       3

*/
	public Pattern182(int n) {
		for(int row=n; row>=-n; row--) {
			for(int s=1; s<=Math.abs(row); s++) {
				System.out.print("  ");
			}for(int column=Math.abs(row); column<=n; column++) {
				System.out.printf("%2d", column);
			}
			System.out.println();
		}
	}

}
