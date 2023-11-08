package day12;

public class Pattern172 {
/*
 5
 4 5
 3 4 5
 2 3 4 5
 1 2 3 4 5
 0 1 2 3 4 5
 1 2 3 4 5
 2 3 4 5
 3 4 5
 4 5
 5

*/
	public Pattern172(int n) {
		for(int row=n; row>=-n; row--) {
			for(int column=Math.abs(row); column<=n; column++) {
				System.out.printf("%2d", column);
			}
			System.out.println();
		}
	}

}
