package day12;

public class Pattern177 {
/*
 D
 C D
 B C D
 A B C D
 B C D
 C D
 D
*/
	public Pattern177(int n) {
		int k=n;
		char ch=65;
		for(int row=n; row>=-n; row--) {
			for(int column=Math.abs(row); column<=n; column++) {
				System.out.printf("%2c",ch+column );
			}System.out.println();
			
		}
	}

}
