package day12;

public class Pattern156 {
/*
         A
       B B B
     C C C C C
   D D D D D D D
 E E E E E E E E E

*/
	public Pattern156(int n) {
		
		int k=0;
		
		char ch=65;
		for(int row=0; row<n; row++) {
			for(int s=n-1; s>row; s--) {
				System.out.print("  ");
			}for(int column=0; column<=k; column++) {
				System.out.printf("%2c",(char)(ch+row));
			}
			System.out.println();
			k=k+2;
			
		}
	}

}
