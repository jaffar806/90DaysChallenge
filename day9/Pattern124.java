package day9;

public class Pattern124 {
/*
 E E E E E
   D D D D
     C C C
       B B
         A

*/
	public Pattern124(int n) {
		char ch=65;
		for(int row=n; row>0; row--) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("  ");
			}for(int column=1; column<=row; column++) {
				System.out.printf("%2c", (char)ch+row-1);
				
			}
			
			System.out.println();
		}
	}

}
