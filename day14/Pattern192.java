package day14;

public class Pattern192 {
/*
 1 2 3 4 5
 2 3 4 5 1
 3 4 5 2 1
 4 5 3 2 1
 5 4 3 2 1

*/
	public Pattern192(int n) {
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=n; column++) {
				if(column<=n-row+1) {
					System.out.printf("%2d", row+column-1);
				}else {
					System.out.printf("%2d", n-column+1);
				}
			}
			System.out.println();
	}

}
}