package day11;

public class Pattern148 {
/*
         0
       1 0 1
     2 1 0 1 2
   3 2 1 0 1 2 3
 4 3 2 1 0 1 2 3 4

*/
	public Pattern148(int n) {
		int z=1;
		int x=1;
		for(int row=1; row<=n; row++) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("  ");
			}for(int column=1; column<=x; column++) {
				System.out.printf("%2d",Math.abs(z-column));
			}
			System.out.println();
			z++;
			x=x+2;
		}
	}

}
