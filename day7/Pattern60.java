package day7;

public class Pattern60 {
/*
0 
1 1 
0 0 0 
1 1 1 1 
0 0 0 0 0 

*/
	public Pattern60(int n) {
		for(int row=0; row<n; row++) {
			for(int column=0; column<=row; column++) {
				System.out.print((row%2)+ " ");
			}
			System.out.println();
		}
	
	}

}
