package day4;

public class Pattern21 {
/*
0 1 0 1 0 
0 0 0 0 0 
0 1 0 1 0 
0 0 0 0 0 
0 1 0 1 0 
*/
	public Pattern21(int num) {
		for(int row=1; row<=num; row++) {
			for(int column=0; column<num; column++) {
				System.out.print((row*column)%2+ " ");
			}
			System.out.println();
		}
	}

}
