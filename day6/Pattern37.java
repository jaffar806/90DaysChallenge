package day6;

public class Pattern37 {
/*

5 
4 4 
3 3 3 
2 2 2 2 
1 1 1 1 1 

*/
	public Pattern37(int n) {
		for(int row=n; row>=1; row--) {
			for(int column=n; column>=row; column--) {
				System.out.print(row+ " ");
				
			}
			System.out.println();
		}
	
	}

}
