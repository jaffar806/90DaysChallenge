package day7;

public class Pattern90 {

	public Pattern90(int n) {
		char ch=65;
		for(int row=0; row<=n; row++) {
			for(int column=n-1; column>=row; column--) {
				System.out.print((char)(ch+column)+ " ");
			}
			System.out.println();
		}
	}

}
