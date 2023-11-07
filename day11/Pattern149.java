package day11;

public class Pattern149 {
/*
                 1
              1  2  1
           1  2  3  2  1
        1  2  3  4  3  2  1
     1  2  3  4  5  4  3  2  1
  1  2  3  4  5  6  5  4  3  2  1

*/
	public Pattern149(int n) {
		for(int row=1; row<=n; row++) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("   ");
			}for(int column=row-1; column>=-(row-1); column--) {
				System.out.printf("%3d", row-Math.abs(column));
			}
			System.out.println();
		}
	}

}
