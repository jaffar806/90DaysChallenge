package day9;

public class Pattern126 {
/*	 A A A A A
	   B B B B
	     C C C
	       D D
	         E
*/
	public Pattern126(int n) {
		char ch=65;
		for(int row=n; row>0; row--) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("  ");
			}for(int column=0; column<row; column++) {
				System.out.printf("%2c", ch);
					
			}
			ch++;
			System.out.println();
		}
	}

}
