package day10;

public class Pattern137 {
/*
E D C B A 
 D C B A 
  C B A 
   B A 
    A 

*/
	public Pattern137(int n) {
		char ch=64;
		for(int row=n; row>0; row--) {
			for(int s=n-1; s>=row; s--) {
				System.out.print(" ");
			}for(int column=row; column>0; column--) {
				System.out.print((char)(ch+column)+ " ");
			}
			
			System.out.println();
		}
	}

}
