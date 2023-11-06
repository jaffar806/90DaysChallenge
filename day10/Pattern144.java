package day10;

public class Pattern144 {
/*
         5
       4 4 4
     3 3 3 3 3
   2 2 2 2 2 2 2
 1 1 1 1 1 1 1 1 1


*/
	public Pattern144(int n) {
		int k=1;
		for(int row=n; row>=1; row--) {
			
			for(int s=1; s<row; s++) {
				System.out.print("  ");
			}
			for(int column=1; column<=k; column++) {
				System.out.printf("%2d", row);
				
			}
			k=k+2;
			System.out.println();
		}
	}

}
