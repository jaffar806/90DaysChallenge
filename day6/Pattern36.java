package day6;

public class Pattern36 {
/*

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

*/
	public Pattern36(int n) {
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=row; column++) {
				System.out.print(column+ " ");
				
			}
			System.out.println();
		}
	
	}

}
