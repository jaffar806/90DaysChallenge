package day9;

public class Patternb {
/*
  1  2  3  4  5
     6  7  8  9
       10 11 12
          13 14
             15
   
 */
	public Patternb(int n) {
		int k=1;
		for(int row=n; row>0; row--) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("   ");
			}for(int column=1; column<=row; column++) {
				System.out.printf("%3d", k);
				k++;
			}
			System.out.println();
		}
	}

}
