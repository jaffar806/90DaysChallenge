package day6;

public class Pattern45 {
/* 
 
1 
3 5 
7 9 11 
13 15 17 19 
21 23 25 27 29 
*/
	public Pattern45(int n) {
		int z=1;
		for(int row=n; row>0; row--) {
			  
			for(int column=n; column>=row; column--) {
				System.out.print(z+ " ");
				z=z+2;;
			}
			System.out.println();
	}
	}

}
