package day4;

public class Pattern20 {
/*
1 0 1 0 1 
0 0 0 0 0 
1 0 1 0 1 
0 0 0 0 0 
1 0 1 0 1 
*/	

	public Pattern20(int num) {
		for(int row=1; row<=num; row++) {
			for(int column=1; column<=num; column++) {
				System.out.print((row*column)%2+ " ");
			}
			System.out.println();
		}
	}

}
