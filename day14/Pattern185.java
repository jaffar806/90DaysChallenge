package day14;

public class Pattern185 {
/*
       D
     C D
   B C D
 A B C D
   B C D
     C D
       D

*/
	public Pattern185(int n) {
		char ch=65; 
		for(int row=n; row>=-n; row-- ) {
			for(int space=1; space<=Math.abs(row); space++) {
				System.out.print("  ");
			}for(int column=Math.abs(row); column<=n; column++) {
				System.out.printf("%2c", column+ch);
			}
			System.out.println();
		      }
			
			}
}