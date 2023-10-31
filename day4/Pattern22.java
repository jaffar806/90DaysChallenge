package day4;

public class Pattern22 {
/*
0 0 0 0 0 
1 1 1 1 1 
0 0 0 0 0 
1 1 1 1 1 
0 0 0 0 0 
*/
	public Pattern22(int num) {
		for(int row=0; row<num; row++) {
			for(int column=1; column<=num; column++) {
				System.out.print(row%2+ " ");
			}
			System.out.println();
		}
	}

}
