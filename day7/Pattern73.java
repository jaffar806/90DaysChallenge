package day7;

public class Pattern73 {
/*
5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1 


*/
	public Pattern73(int n) {
		for(int row=n; row>=0; row--) {
			for(int column=1; column<=row; column++) {
				System.out.print(row+ " ");
			}
			System.out.println();
		}
	}

}
