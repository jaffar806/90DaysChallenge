package day7;

public class Pattern81 {
/*
1 1 1 1 1 
0 0 0 0 
1 1 1 
0 0 
1 

*/
	public Pattern81(int n) {
		for(int row=1; row<=n; row++) {
			for(int column=n; column>=row; column--) {
				System.out.print((row%2)+ " ");
			}
			System.out.println();
		}
	}

}
