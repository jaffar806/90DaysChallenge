package day4;

public class Pattern18 {
/*
0 1 0 1 0 
1 0 1 0 1 
0 1 0 1 0 
1 0 1 0 1 
0 1 0 1 0 
*/
	public Pattern18(int num) {
		for(int row=1; row<=num; row++) {
			for(int column=1; column<=num; column++) {
				System.out.print((row+column)%2+ " "); //this condition is important
			}
			System.out.println();
		}
	}
	

}
