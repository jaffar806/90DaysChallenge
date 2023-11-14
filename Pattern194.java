package day14;

public class Pattern194 {
/*
 5 4 3 2 1
 1 5 4 3 2
 1 1 5 4 3
 1 1 1 5 4
 1 1 1 1 5

*/
	public Pattern194(int n) {
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=n; column++) {
				if(column>=row) {
					System.out.printf("%2d",n-column+row);
				}else {
					System.out.printf("%2d",1);
				}
			}
			System.out.println();
	}

  }
}