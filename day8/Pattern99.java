package day8;

public class Pattern99 {
/*
    5
   45
  345
 2345
12345
*/
	public Pattern99(int n) {
		
		for(int row=1; row<=n; row++) {
			int k=n-row+1;
			for(int s=n-1; s>=row; s--) {
				System.out.print(" ");
			}for(int column=1; column<=row; column++) {
				System.out.print(k);
				k=k+1;
				
			}
		    
			System.out.println();
		}
	}

}
