package day8;

public class Pattern100 {
/*
         1
       2 1
     3 2 1
   4 3 2 1
 5 4 3 2 1

*/
	 Pattern100(int n) {
		for(int row=1; row<=n; row++) {
			int k=row;
			for(int s=n-1; s>=row; s--) {
				System.out.print("  "); //2 times space 
			}for(int column=1; column<=row; column++) {
	          System.out.printf("%2d",k); //thid logic is important  %2d 
	          k=k-1;
				
			}
			System.out.println();
		}
	}

}
