package day7;

public class Pattern82 {
/*
0 0 0 0 0 
1 1 1 1 
0 0 0 
1 1 
0 

*/
	public Pattern82(int n) {
		for(int row=0; row<n; row++) {
			for(int column=n; column>row; column--) {
				System.out.print((row%2)+ " ");
			}
			System.out.println();
		}
		
	}

}
