package day14;

public class Pattern187 {
/*
       A
     A B
   A B C
 A B C D
   A B C
     A B
       A

*/
	public Pattern187(int n) {
		char ch=65; 
		for(int row=n; row>=-n; row--) {
			for(int space=1; space<=Math.abs(row); space++) {
				System.out.print("  ");
			}for(int column=0; column<=n-Math.abs(row); column++) {
				System.out.printf("%2c", column+ch);
			}
			System.out.println();
		}
	}

}
