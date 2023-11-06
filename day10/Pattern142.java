package day10;

public class Pattern142 {
/*
    1
   123
  12345
 1234567
123456789

*/
	public Pattern142(int n) {
		int k=0;
		for(int row=1; row<=n; row++) {
			for(int s=n-1; s>=row; s--) {
				System.out.print(" ");
			}for(int column=1; column<=row+k; column++) {
				System.out.print(column);
			}
			k++;
			System.out.println();
		}

	}

}
