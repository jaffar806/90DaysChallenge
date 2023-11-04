package day8;

public class Pattern102 {
/*
              1
           3  5
        7  9 11
    13 15 17 19
 21 23 25 27 29

*/
	public Pattern102(int n) {
		int k=1;
		for(int row=1; row<=n; row++) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("   "); //adding 3 times space help you to print 2 digit number in a good order
			}for(int column=1; column<=row; column++) {
				System.out.printf("%3d", k);  //vise versa you should use printf %3d
				k=k+2;
				
			}
			System.out.println();
		}
	}

}
