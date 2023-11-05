package day9;

public class Pattern127 {
/*
   E D C B A
     D C B A
       C B A
         B A
           A

*/
	public Pattern127(int n) {
		int ch=65;
		for(int row=1; row<=n; row++) {
			for(int s=0; s<row; s++) {
				System.out.print("  ");
			}for(int column=n-row; column>=0; column--) {
				System.out.printf("%2c",ch+column);
			}
			
		
			System.out.println();
		}
	}

}
