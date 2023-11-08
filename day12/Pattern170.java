package day12;
/*
 
*
**
***
****
*****
******
*****
****
***
**
*

*/

public class Pattern170 {

	public Pattern170(int n) {
		for(int row=n; row>=-n; row--) {
			for(int column=n; column>=Math.abs(row); column--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
