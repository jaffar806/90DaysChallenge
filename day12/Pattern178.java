package day12;

public class Pattern178 {
/*
 A
 A B
 A B C
 A B C D
 A B C
 A B
 A

*/
	public Pattern178(int n) {
		char ch=65;
		for(int row=n; row>=-n; row--) {
			for(int column=0; column<=n-Math.abs(row); column++) {
				System.out.printf("%2c", column+ch);
			}
			System.out.println();
		}
	}

}
