package day4;

public class Pattern27 {
/*
A B C D E 
A B C D E 
A B C D E 
A B C D E 
A B C D E 
*/
	public Pattern27(char total) {
		char row;
		char column;
		
		for(row='A'; row<=total; row++) {
			for(column='A'; column<=total; column++) {
				System.out.print(column+ " ");
			}
			System.out.println();

	}

}
}
