package day9;

public class Pattern118 {
/*
 5 5 5 5 5
   4 4 4 4
     3 3 3
       2 2
         1

*/
	public Pattern118(int n) {
		for(int row=n; row>0; row--) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("  "
						+ "");
			}for(int column=1; column<=row; column++) {
				System.out.printf("%2d", row);
			}
			System.out.println();
		}
	}

}
