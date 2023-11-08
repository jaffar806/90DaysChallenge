package day12;

public class Pattern166 {
/*
 1 2 3 4 5 6 7 8 9
   1 2 3 4 5 6 7
     1 2 3 4 5
       1 2 3
         1

*/
	public Pattern166(int n) {
		int ts=2*n-1;
		for(int row=n; row>=1; row--) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("  ");
			}for(int column=1; column<=ts; column++) {
				System.out.printf("%2d", column);
			}
			System.out.println();
			ts=ts-2;
		}
	}

}
