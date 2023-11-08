package day12;

public class Pattern167 {
/*
 E E E E E E E E E
   D D D D D D D
     C C C C C
       B B B
         A
                
*/
	public Pattern167(int n) {//65=
		int ts=2*n-1;
		char ch=64; 
		for(int row=n; row>=1; row--) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("  ");
			}for(int column=1; column<=ts; column++) {
				System.out.printf("%2c",ch+row);
			}
			System.out.println();
			ts=ts-2;
			
		}
	}

}
