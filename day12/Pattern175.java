package day12;

public class Pattern175 {
/*
 
1 
3 3 3 
5 5 5 5 5 
7 7 7 7 7 7 7 
9 9 9 9 9 9 9 9 9 
7 7 7 7 7 7 7 
5 5 5 5 5 
3 3 3 
1 

*/
	public Pattern175(int n) {
		int k=1; 
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=k; column++) {
				System.out.print(k+" ");
			}
			if(row<=n/2) {
				k=k+2;
			}else {
				k=k-2;
			}
			System.out.println();
		}
	}

}
