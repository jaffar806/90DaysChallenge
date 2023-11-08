package day12;

public class Pattern1611 {

	public Pattern1611(int n) {
		int k=1;
		char ch=65;
		for(int row=1; row<=n; row++) {
			for(int s=n-1; s>=row; s--) {
				System.out.print("  ");
			}for(int column=k; column>=1; column--) {
				System.out.printf("%2c",(row-Math.abs(column)+ch ));
			}
			System.out.println();
			k=k+2;
		}
	}

}
