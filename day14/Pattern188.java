package day14;

public class Pattern188 {
/*
 
1 2 3 4 5 
5 4 3 2 1 
1 2 3 4 5 
5 4 3 2 1 
1 2 3 4 5 

*/
	public Pattern188(int n) {
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=n; column++) {
				if(row%2==1) {
					System.out.print(column+ " ");
				}else {
					System.out.print((n-column+1)+ " ");
				}
			}
			System.out.println();
		}
	}

}
