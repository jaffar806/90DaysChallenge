package day14;

public class Pattern193 {
/*
 1 1 1 1 1
 1 1 1 1 2
 1 1 1 3 3
 1 1 4 4 4
 1 5 5 5 5

*/
	public Pattern193(int n) {
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=n; column++) {
			  if(row+column<=n+1) {
				  System.out.printf("%2d",1);
			  }else {
				  System.out.printf("%2d", row);
				  
			  }
	      }
          System.out.println();
       }
     }
	}