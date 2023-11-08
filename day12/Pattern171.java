package day12;

public class Pattern171 {
/*
 5
 5 4
 5 4 3
 5 4 3 2
 5 4 3 2 1
 5 4 3 2 1 0
 5 4 3 2 1
 5 4 3 2
 5 4 3
 5 4
 5

*/
	public Pattern171(int n) {
		for(int row=n; row>=-n; row--) {
			for(int column=n; column>=Math.abs(row); column--) {
				System.out.printf("%2d", column);
			}
			System.out.println();
		}
	}

}
