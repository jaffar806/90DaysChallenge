package day9;

public class Pattern112 {
/*
         A
       A B
     A B C
   A B C D
 A B C D E

*/
	public Pattern112(int n) {
		
		for(int row=n; row>=1; row--) {
			int ch=65;
			for(int s=1; s<row; s++) {
				System.out.print("  ");
			}for(int column=n; column>=row; column--) {
				System.out.printf("%2c", (char)ch);
				ch=ch+1;
				
			}
			System.out.println();
		}
	}

}
