package day9;

public class Pattern120 {
/*
 1 1 1 1 1
   2 2 2 2
     3 3 3
       4 4
         5

*/
	public Pattern120(int n) {
		int k=1;
		for(int row=5; row>0; row--) {
			for(int s=n-1; s>= row; s--) {
				System.out.print("  ");
			}for(int column=1; column<=row; column++) {
				System.out.printf("%2d", k);
			}
			k++;
			System.out.println();
		}
	}

}
