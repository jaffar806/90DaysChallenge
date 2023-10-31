package day4;

public class Pattern17 {
/*
1 3 5 7 9 
3 5 7 9 11 
5 7 9 11 13 
7 9 11 13 15 
9 11 13 15 17 
*/	
	

	public Pattern17(int num) {
      for(int row=1; row<=num; row++) {
    	  for(int column=1; column<=num; column++) {
    		  System.out.print(2*(row+column)-3+ " "); //this condition is important
    		  
    	  }System.out.println();
      }
	}

}
