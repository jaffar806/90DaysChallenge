package day15;

public class Pattern197 {
/*
 1 2 3 4 5
 6 7 8 1 2
 3 4 5 6 7
 8 1 2 3 4
 5 6 7 8 1

*/
	public Pattern197(int n) {
		int x=1;
		int limit=8;
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=n; column++) {
				System.out.printf("%2d", x);
				x++;
				if(x == limit+1) {
					x=1;
				}
			}
			System.out.println();
		}
	}

}
