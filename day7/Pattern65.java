package day7;

public class Pattern65 {
/*
A 
B B 
C C C 
D D D D 
E E E E E 

*/	

	public Pattern65(int n) {
		char ch = 65;
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=row; column++) {
				System.out.print((char)ch+ " ");
			}
			ch++;
			System.out.println();
		}
	}
	

}
