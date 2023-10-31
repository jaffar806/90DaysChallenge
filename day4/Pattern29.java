package day4;

public class Pattern29 {
/*
E D C B A 
E D C B A 
E D C B A 
E D C B A 
E D C B A 
*/
	public Pattern29(char total) {
		char row;
		char column;
		
		for(row=total; row>='A'; row--) {
			for(column=total; column>='A'; column--) {
				System.out.print(column+ " ");
			}
			System.out.println();

	}

	}

}
