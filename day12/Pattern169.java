package day12;

public class Pattern169 {
/*
 A B C D E F G H I
   A B C D E F G
     A B C D E
       A B C
         A

*/
	public Pattern169(int n) {
		int ts=2*n-1; 
		char ch=64;
		for(int row=n; row>=1; row--) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("  ");
			}for(int column=1; column<=ts; column++) {
				System.out.printf("%2c", (ch+column));
			}
			System.out.println();
			ts=ts-2;
		}
	}

}
