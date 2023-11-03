package day7;

public class Pattern83 {
/*

1 0 1 0 1 
1 0 1 0 
1 0 1 
1 0 
1 

*/
	public Pattern83(int n) {
	       for(int row=n; row>0; row--) {
	    	   for(int column=1; column<=row; column++) {
	    		   System.out.print(column%2+ " ");
	    	   }
	    	   System.out.println();
	       }
	}

}
