package day8;

public class Pattern98 {
/*
    5
   44
  333
 2222
11111

*/
	public Pattern98(int n) {
		int k=n;
		for(int row=1; row<=n; row++) {
			for(int space=n-1; space>=row; space--) {
				System.out.print(" ");
			}for(int column=1; column<=row; column++ ) {
				System.out.print(k);
			}
			k--;
			System.out.println();
		}
	}

}
