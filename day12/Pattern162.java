package day12;

public class Pattern162 {
/*
         A
       B C B
     C D E D C
   D E F G F E D
 E F G H I H G F E

*/
	public Pattern162(int n) {
		int k=0;
		char ch=65;
		for(int row=1; row<=n; row++) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("  ");
			}for(int column=row-1; column>=-(row-1); column--) {
				System.out.printf("%2c",k-Math.abs(column)+ch );
			}
			System.out.println();
			k=k+2;
		}
	}

}
