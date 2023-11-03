package day7;

public class Pattern75 {
/*
5 4 3 2 1 
6 5 4 3 
7 6 5 
8 7 
9 

*/
	public Pattern75(int n) {
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=n-row+1; column++) {
				System.out.print((n-column+row)+ " ");
			}
			
			System.out.println();
		}
	}

}
