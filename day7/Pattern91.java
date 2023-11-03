package day7;

public class Pattern91 {
/*
E D C B A 
D C B A 
C B A 
B A 
A 


*/
	public Pattern91(int n) {
		char ch=65;
		for(int row=0; row<=n; row++) {
			for(int column=n-1; column>=row; column--) {
				System.out.print((char)(ch+column-row)+ " ");
			}
			System.out.println();
		}
	}

}
