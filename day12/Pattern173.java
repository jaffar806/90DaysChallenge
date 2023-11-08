package day12;

public class Pattern173 {
/*
 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

*/
	public Pattern173(int n) {
		int k=1; 
		 
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=k; column++) {
				System.out.print(column+ " ");
				
			}
				if(row<=n/2) {
					k++; 
				}else {
					k--;
				}
				System.out.println();
			}
			
			
		}
	}


