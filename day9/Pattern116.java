package day9;

public class Pattern116 {

	public Pattern116(int n) {
		for(int row=n; row>0; row--) {
			char ch=64;
			for(int s=row; s>1; s--) {
				System.out.print("  ");
			}for(int column=row; column<=n; column++) {
				System.out.printf("%2c",(char)ch+row);
				
			}
			System.out.println();
		}
	}

}
