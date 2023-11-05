package day9;

public class Pattern119 {
/*
 1 2 3 4 5
   1 2 3 4
     1 2 3
       1 2
         1

*/
	public Pattern119(int n) {
		for(int row=n; row>0; row--) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("  "
						+ "");
			}for(int column=1; column<=row; column++) {
				System.out.printf("%2d", column);
			}
			System.out.println();
		}
	}

}
