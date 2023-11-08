package day12;

public class Pattern164 {
/*

 5 5 5 5 5 5 5 5 5
   4 4 4 4 4 4 4
     3 3 3 3 3
       2 2 2
         1

*/
	public Pattern164(int n) {
		int ts=n*2-1;
		for(int row=n; row>=1; row--) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("  ");
			}for(int column=1; column<=ts; column++) {
				System.out.printf("%2d", row);
			}
			System.out.println();
			ts=ts-2;
		}
	}

}
