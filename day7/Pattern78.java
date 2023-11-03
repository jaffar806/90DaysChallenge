package day7;

public class Pattern78 {

	public Pattern78(int n) {
		int x= (n*(n+1))/2; //sum of the n terms
		for(int row=n; row>=0; row--) {
			 for(int column=1; column<=row; column++ ) {
				 System.out.print(x + " ");
				 x--;
				 
			 }
			 System.out.println();
		 }

		
	}

}
