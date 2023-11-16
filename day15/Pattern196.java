package day15;

public class Pattern196 {
/*
 1 3 5 7 9
 3 5 7 9 1
 5 7 9 1 3
 7 9 1 3 5
 9 1 3 5 7

*/
	
	public Pattern196(int n) {
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=n; column++) {
				int x=2*(row+column);
				if(row+column<=n+1) {
					System.out.printf("%2d", x-3);
				}else {
					System.out.printf("%2d", x-(n*2+3));
				}
			}
			System.out.println();
		}
	}

}
