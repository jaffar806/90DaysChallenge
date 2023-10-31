package day4;

public class Pattern28 {
/*
E E E E E 
D D D D D 
C C C C C 
B B B B B 
A A A A A 
*/
	public Pattern28(char total) {
		char row;
		char column;
		
		for(row=total; row>='A'; row--) {
			for(column=total; column>='A'; column--) {
				System.out.print(row+ " ");
			}
			System.out.println();

	}

	}

}
