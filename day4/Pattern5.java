package day4;

public class Pattern5 {
	/*
	5 4 3 2 1 
	5 4 3 2 1 
	5 4 3 2 1 
	5 4 3 2 1 
	5 4 3 2 1 
	*/	

	public Pattern5(int num) {
		for(int i=1; i<=num; i++) {
			for(int column=5; column>=1; column--) {
				System.out.print(column+ " ");
			}
			System.out.println();
		}
	}

}
