package day7;

public class Pattern84 {
/*
0 1 0 1 0 
0 1 0 1 
0 1 0 
0 1 
  0 

*/
	public Pattern84(int n) {
		for(int row=n; row>0; row--) {
			for(int column=0; column<row; column++) {
				System.out.print(column%2+ " ");
			}
			System.out.println();
		}
	}

}
