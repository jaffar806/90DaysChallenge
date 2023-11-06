package day10;

public class Pattern143 {
/*
         1
       3 2 1
     5 4 3 2 1
   7 6 5 4 3 2 1
 9 8 7 6 5 4 3 2 1

*/
	public Pattern143(int n) {
		int k=1;
		for(int row=1; row<=n; row++) {
			
			for(int s=n-1; s>=row; s--) {
				System.out.print("  ");
			}
			for(int column=k; column>=1; column--) {
				System.out.printf("%2d", column);
				
			}
			k+=2;;
			System.out.println();
		}
	}

}
