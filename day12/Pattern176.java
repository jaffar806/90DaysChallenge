package day12;

public class Pattern176 {
/*
 D
 D C
 D C B
 D C B A
 D C B
 D C
 D

*/
	public Pattern176(int n) {
		char ch=65; 
		for(int row=n; row>=-n; row--) {
			for(int column=n; column>=Math.abs(row); column--) {
				System.out.printf("%2c", ch+column);
			}
			System.out.println();
			
		}
	}

}
