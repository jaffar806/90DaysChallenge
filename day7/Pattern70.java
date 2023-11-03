package day7;

public class Pattern70 {
/*

* * * * * 
* * * * 
* * * 
* * 
* 

*/
	public Pattern70(int n) {
		for(int row=n; row>0; row--) {
			for(int column=1; column<=row; column++) {
				System.out.print("*"+ " ");
				
			}
			System.out.println();
		}
	}

}
