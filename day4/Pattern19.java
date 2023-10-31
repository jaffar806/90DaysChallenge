package day4;

public class Pattern19 {
	/*
1 0 1 0 1 
0 1 0 1 0 
1 0 1 0 1 
0 1 0 1 0 
1 0 1 0 1 
*/

	public Pattern19(int num) {
		for(int row=1; row<=num; row++) {
			for(int column=0; column<num; column++) {  //made column to 0
				System.out.print((row+column)%2+ " ");  //added row + column
			}
			System.out.println();
		}
	}

}
