package day7;

public class Pattern89 {
/*

E E E E E 
D D D D 
C C C 
B B 
A 

*/
	public Pattern89(int n) {
		char ch=65; 
		for(int row=n-1; row>=0; row--) {
			for(int column=0; column<=row; column++) {
				System.out.print((char)(ch+row)+ " ");
				
			}
			System.out.println();
		}
	}

}
