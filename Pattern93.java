package day8;

public class Pattern93 {
/*
E F G H I 
D E F G 
C D E 
B C 
A 

*/
	public Pattern93(int n) {
		char ch=64;
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=n-row+1; column++) {
				System.out.print((char)(n-row+column+ch)+ " ");
				
			}
			System.out.println();
		}
	}

}
