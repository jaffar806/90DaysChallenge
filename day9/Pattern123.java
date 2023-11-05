package day9;

public class Pattern123 {
/*
  1  2  3  4  5
     5  6  7  8
        8  9 10
          10 11
             11

*/
	public Pattern123(int n) {
		int k=0; 
		for(int row=n; row>0; row--) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("   ");
			}for(int column=1; column<=row; column++) {
				System.out.printf("%3d", k+1);
				k++;
			}
			k--;
			System.out.println();
		}
	}

}
