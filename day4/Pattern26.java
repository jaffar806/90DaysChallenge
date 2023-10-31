package day4;

public class Pattern26 {
/*
A A A A A 
B B B B B 
C C C C C 
D D D D D 
E E E E E 
*/
	public Pattern26(char total) {
		char row;
		char column;
		
		for(row='A'; row<=total; row++) {
			for(column='A'; column<=total; column++) {
				System.out.print(row+ " ");
			}
			System.out.println();

	}
}
}