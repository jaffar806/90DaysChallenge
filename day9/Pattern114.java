package day9;

public class Pattern114 {
/*
           A
         B A
       C B A
     D C B A
   E D C B A

*/
	public Pattern114(int n) {
		int ch=65;
		for(int row=0; row<n; row++) {
			for(int s=0; s<n-row; s++) {
				System.out.print("  ");
			}for(int column=row; column>=0; column--) {
				System.out.printf("%2c", (char)ch+column);
			}
			System.out.println();	
		}
	}

}
	