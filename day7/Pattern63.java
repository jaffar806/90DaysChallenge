package day7;

public class Pattern63 {
/*
0 
1 0 
0 1 0 
1 0 1 0 
0 1 0 1 0 
*/
	public Pattern63(int n) {
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=row; column++) {
				System.out.print((column+row)%2+ " ");
			}
			System.out.println();
		}
	}

}
