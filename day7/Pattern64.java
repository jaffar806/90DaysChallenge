package day7;

public class Pattern64 {
/*
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
*/
	public Pattern64(int n) {
		for(int row=1; row<=n; row++) {
			for(int column=0; column<row; column++) {
				System.out.print((column+row)%2+ " ");
			}
			System.out.println();
		}
	}

}
