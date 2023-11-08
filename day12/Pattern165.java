package day12;

public class Pattern165 {
/*
  9 9 9 9 9 9 9 9 9
   7 7 7 7 7 7 7
     5 5 5 5 5
       3 3 3
         1

 */
	public Pattern165(int n) {
		int ts=2*n-1;
		for(int row=n; row>=1; row--) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("  ");
			}for(int column=1; column<=ts; column++) {
				System.out.printf("%2d", ts);
			}
			System.out.println();
			ts=ts-2;
		}
	}

}
