package day6;

public class Pattern41 {
/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

*/
	public Pattern41(int n) {
		int x=1;
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=row; column++) {
				System.out.print(x+ " ");
				x++;
				
			}
			System.out.println();
		}
	
	}

}
