package day4;

public class Pattern25 {
/*
1 0 1 0 1 
1 0 1 0 1 
1 0 1 0 1 
1 0 1 0 1 
1 0 1 0 1 

*/
	public Pattern25(int num) {
		for(int row=1; row<=num; row++) {
			for(int column=1; column<=num; column++) {
				System.out.print(column%2+ " ");
			}
			System.out.println();
		}
	}

}
