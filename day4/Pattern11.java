package day4;

public class Pattern11 {
/*
1 1 1 2 1 3 
2 1 2 2 2 3 
3 1 3 2 3 3 
4 1 4 2 4 3 
5 1 5 2 5 3 
*/
	public Pattern11(int num) {
		for(int row=1; row<=num; row++) {
			for(int column=1; column<=3; column++) {
				System.out.print(row+ " " +column+ " " );
			}System.out.println();
	}
	}
	
}
