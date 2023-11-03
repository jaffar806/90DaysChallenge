package day7;
/*
E D C B A 
E D C B 
E D C 
E D 
E 
*/
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
