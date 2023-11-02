package day6;

public class Pattern38 {
/*
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 

*/
	public Pattern38(int n) {
		for(int row=n; row>=1; row--) {
			for(int column=n; column>=row; column--) {
				System.out.print(column+ " ");
				
				
			}
			System.out.println();
		}
		
	}

}
