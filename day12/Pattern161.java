package day12;

public class Pattern161 {
/*
         A
       B A B
     C B A B C
   D C B A B C D
 E D C B A B C D E

*/
	public Pattern161(int n) {
		int k=1;
		char ch=65;
		for(int row=1; row<=n; row++) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("  ");
			}for(int column=k; column>=1; column--) {
				System.out.printf("%2c",Math.abs(column- row)+ch );
			}
			System.out.println();
			k=k+2;
		}
	}

}
