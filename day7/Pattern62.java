package day7;

public class Pattern62 {
/*
0 
0 1 
0 1 0 
0 1 0 1 
0 1 0 1 0 
*/
	public Pattern62(int n) {
		for(int row=1; row<=n; row++) {
			for(int column=0; column<row; column++) {
				System.out.print(column%2+ " ");
			}
			System.out.println();
		}
	
	}

}
