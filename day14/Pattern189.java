package day14;

public class Pattern189 {
/*
  1  2  3  4  5
 10  9  8  7  6
 11 12 13 14 15
 20 19 18 17 16
 21 22 23 24 25

*/
	public Pattern189(int n) {
		int k=1;
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=n; column++) {
				if(row%2==1) {
					System.out.printf("%3d",k++);
				}else {
					System.out.printf("%3d",--k);
				}
			}
			System.out.println();
			k+=n;
		}
	}

}
