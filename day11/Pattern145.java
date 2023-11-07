package day11;

public class Pattern145 {
/*
         5
       4 5 6
     3 4 5 6 7
   2 3 4 5 6 7 8
 1 2 3 4 5 6 7 8 9

*/
	public Pattern145(int n) {
		int k=0;
		int z=n;
		for(int row=1; row<=n; row++) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("  ");
			}for(int column=0; column<=k; column++) {
				System.out.printf("%2d", column+z);
			}
			System.out.println();
			z--;
			k=k+2; //in one row 3 times column hona hai na isliye ye condition likha
		    
		}
		
	}
}


