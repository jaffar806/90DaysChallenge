package day9;

public class Pattern107 {
/*
             15
          14 13
       12 11 10
     9  8  7  6
  5  4  3  2  1

*/
	public Pattern107(int n) {
		int k = (n*(n+1))/2;
		for(int row=1; row<=n; row++) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("   ");
			}for(int column=1; column<=row; column++) {
				System.out.printf("%3d", k);
				k=k-1;
				
			}
			
			
			System.out.println();
		}
	}

}
