package day4;
/*
1 2 3 4 5 
2 3 4 5 6 
3 4 5 6 7 
4 5 6 7 8 
5 6 7 8 9 
*/

public class Pattern16 {

	public Pattern16(int num) {
		
		for(int row=1; row<=num; row++) {
			for(int column=1; column<=num; column++) {
				System.out.print(row+column-1+ " " );
			}
			System.out.println();
		}
	}

}
