package day9;

public class Pattern115 {
/*
         E
       D E
     C D E
   B C D E
 A B C D E

*/
	public Pattern115(int n) {
		for(int row=n; row>0; row--) {
			char ch=64;
			for(int s=row; s>1; s--) {
				System.out.print("  ");
			}for(int column=row; column<=n; column++) {
				System.out.printf("%2c",(char)ch+column);
				
			}
			System.out.println();
		}
	}

}
 