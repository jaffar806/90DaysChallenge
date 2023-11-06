package day10;

public class Pattern138 {
/*
 A B C D E 
  A B C D 
   A B C 
    A B 
     A 

*/
	public Pattern138(int n) {
		char ch=65;
		for(int row=n-1; row>=0; row--) {
			for(int s=n-1; s>=row; s--) {
				System.out.print(" ");
			}for(int column=0; column<=row; column++) {
				System.out.print((char)(ch+column)+ " ");
			}
			System.out.println();
		}
	}

}
