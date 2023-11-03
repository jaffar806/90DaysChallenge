package day7;

public class Pattern72 {
/*

1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

*/
	public Pattern72(int n) {
		for(int row=5; row>0; row--) {
			for(int column=1; column<=row; column++) {
				System.out.print(column+ " ");
				
			}
			System.out.println();
		}
	}

}
