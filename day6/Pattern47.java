package day6;

public class Pattern47 {

	public Pattern47(int n) {
		
	
		for(int row=1; row<=n; row++) {
			  
			for(int column=1; column<=row; column++) {
				System.out.print(row*column+ " ");
				
			}
			System.out.println();
	
	}

}}
