package day8;

public class Pattern97 {
/*
    1
   12
  123
 1234
12345

*/
	public Pattern97(int n) {
		for(int row=1; row<=n; row++) {
			for(int s=n-1; s>=row; s--) {
				System.out.print(" ");
			}for(int column=1; column<=row; column++) {
				System.out.print(column); //if i add space here the result is like a triangle
			}
			System.out.println();
		}
	}

}
