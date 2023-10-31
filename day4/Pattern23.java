package day4;

public class Pattern23 {
/*
1 1 1 1 1 
0 0 0 0 0 
1 1 1 1 1 
0 0 0 0 0 
*/
	public Pattern23(int num) {
		for(int row=1; row<=num; row++) {
			for(int column=1; column<=num; column++) {
				System.out.print(row%2+ " ");
			}
			System.out.println();
		}
	
	}

}
