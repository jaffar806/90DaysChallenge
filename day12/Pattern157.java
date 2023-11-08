package day12;

public class Pattern157 {
/*
         A
       C C C
     E E E E E
   G G G G G G G
 I I I I I I I I I

*/
	public Pattern157(int n) {
		int k=0;
		int h=0;
		char ch=65;
		for(int row=0; row<n; row++) {
			for(int s=n-1; s>row; s--) {
				System.out.print("  ");
			}for(int column=0; column<=k; column++) {
				System.out.printf("%2c", ch+h);
			}
			System.out.println();
			k=k+2;
			h=h+2;
		}
	}

}
