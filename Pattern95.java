package day8;

public class Pattern95 {
/*
    *
   **
  ***
 ****
*****

*/
	public Pattern95(int n) {
		/*for(int row=1; row<=n; row++) {
			for(int space=n-1; space>=row; space--) {
				System.out.print(" ");
			}for(int column=1; column<=row; column++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		for(int row=1; row<=n; row++) { //this is using if else method  
			for(int space=n; space>=1; space--) {
				if(row>=space) {
					System.out.print("*");
				}else {
					System.out.print(" ");
					}
			}
			System.out.println();
			}
	}
}
