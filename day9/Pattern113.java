package day9;

public class Pattern113 {

	public Pattern113(int n) {
/*
         A
       B B
     C C C
   D D D D
 E E E E E

*/		
		for(int row=n; row>=1; row--) {
			int ch=70;
			for(int s=1; s<row; s++) {
				System.out.print("  ");
			}for(int column=n; column>=row; column--) {
				System.out.printf("%2c", ((char)ch-row));
				
				
			}
			System.out.println();
		}
	}

}
