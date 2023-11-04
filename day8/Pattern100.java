package day8;

public class Pattern100 {
/*
    1
   21
  321
 4321
54321

*/
	 Pattern100(int n) {
		for(int row=1; row<=n; row++) {
			int k=row;
			for(int s=n-1; s>=row; s--) {
				System.out.print(" ");
			}for(int column=1; column<=row; column++) {
	          System.out.print(k);
	          k=k-1;
				
			}
			System.out.println();
		}
	}

}
