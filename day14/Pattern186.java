package day14;

public class Pattern186 {
/*
       A
     B B
   C C C
 D D D D
   E E E
     F F
       G

*/
	
	public Pattern186(int n) {
		char ch=65;
		int k=0; 
		for(int row=n; row>=-n; row--) {
			for(int s=1; s<=Math.abs(row); s++) {
				System.out.print("  ");
			}for(int column=Math.abs(row); column<=n; column++) {
				System.out.printf("%2c", k+ch);
			}
			System.out.println();
			k++;
		}
	}

}
