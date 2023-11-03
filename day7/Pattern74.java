package day7;

public class Pattern74 {
/*

5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 

*/
	public Pattern74(int n) {
		for(int row=1; row<=n; row++) {
			for(int column=5; column>=row; column--) {
				System.out.print(column+ " ");
			}
			System.out.println();
		}
	}

}
