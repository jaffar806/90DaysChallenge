package day6;

public class Pattern34 {
/*

* 
* * 
* * * 
* * * * 
* * * * * 

*/
	public Pattern34(int n) {
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=row; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
