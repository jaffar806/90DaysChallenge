package day14;

public class Pattern190 {
/*
 
 1 2 3 4 5
 2 3 4 5 5
 3 4 5 5 5
 4 5 5 5 5
 5 5 5 5 5

*/
	public Pattern190(int n) {
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=n; column++) {
				if(column<=n-row) {
					System.out.printf("%2d",row+column-1);
				}else {
					System.out.printf("%2d",n);
				}
			}
			System.out.println();
		}
	}

}
