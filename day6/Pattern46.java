package day6;

public class Pattern46 {
/*
2 
4 6 
8 10 12 
14 16 18 20 
22 24 26 28 30 
*/
	public Pattern46(int n) {
	      
	   int z=2;
		for(int row=n; row>0; row--) {
			  
			for(int column=n; column>=row; column--) {
				System.out.print(z+ " ");
				z=z+2;;
			}
			System.out.println();
	
	}

}}
