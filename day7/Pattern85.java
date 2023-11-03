package day7;

public class Pattern85 {
/*
0 1 0 1 0 
1 0 1 0 
0 1 0 
1 0 



0 

*/
	public Pattern85(int n) {
		for(int row=n; row>0; row--) {
			for(int column=1; column<=row; column++) {
				System.out.print((row+column)%2+ " ");
			}
			System.out.println();
		}
	}

}
