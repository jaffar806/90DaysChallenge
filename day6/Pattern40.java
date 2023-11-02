package day6;

public class Pattern40 {
/*
5 
4 5 
3 4 5 
2 3 4 5 
1 2 3 4 5 
*/
	public Pattern40(int n) {
		for(int row=n; row>=1; row--) {
			for(int column=row; column<=n; column++) {
				System.out.print(column+ " ");
				
			}
			System.out.println();
		}
	
	                                                                             
	}

}
