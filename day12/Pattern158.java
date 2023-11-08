package day12;

public class Pattern158 {
/*
         A
       A B C
     A B C D E
   A B C D E F G
 A B C D E F G H I

*/
	public Pattern158(int n) {
		int k=0;
		char ch=65;
		for(int row=0; row<n; row++) {
			for(int s=n-1; s>row; s--) {
				System.out.print("  ");
			}for(int column=0; column<=k; column++) {
				System.out.printf("%2c", ch+column);
			}
			System.out.println();
			k=k+2;
		}
		
	}

}
