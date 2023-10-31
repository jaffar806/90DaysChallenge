package day4;

public class Pattern24 {
/*
0 1 0 1 0 
0 1 0 1 0 
0 1 0 1 0 
0 1 0 1 0 
0 1 0 1 0 

*/
	public Pattern24(int num) {
		for(int row=1; row<=num; row++) {
			for(int column=0; column<num; column++) {
				System.out.print(column%2+ " ");
			}
			System.out.println();
		}
	
	}

}
