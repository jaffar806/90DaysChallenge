package day9;

public class Pattern125 {
/*
 A B C D E
   A B C D
     A B C
       A B
         A

*/
	public Pattern125(int n) {
		char ch=65;
		for(int row=n; row>0; row--) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("  ");
			}for(int column=0; column<row; column++) {
				System.out.printf("%2c", ch+column);
					
			}
			
			System.out.println();
		}
	}

}
