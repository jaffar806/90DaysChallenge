package day11;

public class Pattern146 {
/*
         5
       6 5 4
     7 6 5 4 3
   8 7 6 5 4 3 2
 9 8 7 6 5 4 3 2 1

*/
	public Pattern146(int n) {
		
		int x=0;
		int s;
		
		for(int row=n; row>0; row--) {
			for( s=1; s<row; s++) {
				System.out.print("  ");
			}for(int column=x; column>=0; column--) {
				System.out.printf("%2d", column+s);
			}
			System.out.println();
			x=x+2;;
			
			
		}
	}

}
