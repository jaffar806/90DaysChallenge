package day10;

public class Pattern141 {
/*
    1
   333
  55555
 7777777
999999999

*/
	public Pattern141(int n) {
		int k=0;
		for(int row=1; row<=n; row++) {
			for(int s=n-1; s>=row; s--) {
				System.out.print(" ");
			}for(int column=1; column<=row+k; column++) {
				System.out.print(row+k);
			}
			k++;
			System.out.println();
		}
	}

}
