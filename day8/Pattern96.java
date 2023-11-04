package day8;

public class Pattern96 {
/*
    1
   22
  333
 4444
55555

*/
	public Pattern96(int n) {
		for(int row=1; row<=n; row++) {
			for(int s=n-1; s>=row; s--) {
				System.out.print(" ");
			}for(int column=1; column<=row; column++) {
				System.out.print(row);
			}
			System.out.println();
		}
		
	}

}
