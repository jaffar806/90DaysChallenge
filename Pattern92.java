package day8;

public class Pattern92 {
/*
E D C B A 
F E D C 
G F E 
H G 
I 

*/
	public Pattern92(int n) {
		char ch =64;
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=n-row+1; column++) {
				System.out.print((char)(n-column+row+ch)+ " ");
			}
			System.out.println();
		}
	}

}
