package day10;

public class Pattern140 {
/*
    1
   222
  33333
 4444444
555555555

*/
	public Pattern140(int n) {
		int k=0;
		for(int row=1; row<=n; row++) {
			for(int s=n-1; s>=row; s--) {
				System.out.print(" ");
			}for(int column=1; column<=row+k; column++) {
				System.out.print(row);
			}
			k++;
			System.out.println();
		}
	
	}

}
