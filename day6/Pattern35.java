package day6;

public class Pattern35 {
/*

1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 

*/
	public Pattern35(int n) {
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=row; column++) {
				System.out.print(row+ " ");
			}
			System.out.println();
		}
	
	}

}
