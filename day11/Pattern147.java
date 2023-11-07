package day11;

public class Pattern147 {
/*
              1
           2  3  4
        5  6  7  8  9
    10 11 12 13 14 15 16
 17 18 19 20 21 22 23 24 25

*/
	public Pattern147(int n) {
		int x=1;
		int k=1;
		for(int row=1; row<=n; row++) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("   ");
			}for(int column=1; column<=k; column++) {
				System.out.printf("%3d", x);
				x++;
			}
			System.out.println();
			k=k+2;
			
		}
	}

}
