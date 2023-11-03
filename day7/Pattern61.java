package day7;

public class Pattern61 {
/*

1 
1 0 
1 0 1 
1 0 1 0 
1 0 1 0 1 

*/
	public Pattern61(int n) {
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=row; column++) {
				System.out.print(column%2+ " ");
			}
			System.out.println();
		}
	
	}

}
