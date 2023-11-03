package day7;

public class Pattern71 {
/*

1 1 1 1 1 
2 2 2 2 
3 3 3 
4 4 
5 

*/
	public Pattern71(int n) {
		for(int row=1; row<=n; row++) {
			for(int column=n; column>=row; column--) {
				System.out.print(row+ " ");
				
			}
			System.out.println();
		}
	}

}
