package day4;

public class Pattern9 {
/*
1 2 3 4 5 
2 4 6 8 10 
3 6 9 12 15 
4 8 12 16 20 
5 10 15 20 25 

*/
	public Pattern9(int num) {
		
		for(int row=1; row<=num; row++) {
		  for(int column=1; column<=num; column++) {
			  System.out.print(row*column+ " ");
		  }
		  System.out.println();
		}
		}
  
}
