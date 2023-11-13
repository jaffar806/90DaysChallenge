package day14;

public class Pattern191 {
/*
 5 5 5 5 5
 4 5 5 5 5
 3 4 5 5 5
 2 3 4 5 5
 1 2 3 4 5

*/
	public Pattern191(int n) {
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=n; column++) {
				if(column<row) {
					System.out.printf("%2d",n+column-row);
				}else {
					System.out.printf("%2d", n);
				}
			}
			System.out.println();
	}

}}
