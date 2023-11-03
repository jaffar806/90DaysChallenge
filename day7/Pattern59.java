package day7;

public class Pattern59 {
	/*
	1 
	0 0 
	1 1 1 
	0 0 0 0 
	1 1 1 1 1 

	*/
	public Pattern59(int n) {
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=row; column++) {
				System.out.print((row%2)+ " ");
			}
			System.out.println();
		}
	
		
	}

}
