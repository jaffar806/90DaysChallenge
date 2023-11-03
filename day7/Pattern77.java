package day7;

public class Pattern77 {
/*
1 2 3 4 5 
6 7 8 9 
10 11 12 
13 14 
15 

*/
	
	public Pattern77(int n) {
		int k=1;
		for(int row=n; row>=0; row--) {
			 for(int column=1; column<=row; column++ ) {
				 System.out.print(k + " ");
				 k++;
			 }
			 System.out.println();
		 }

	}

}
