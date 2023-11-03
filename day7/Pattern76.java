package day7;

public class Pattern76 {
/*
5 6 7 8 9 
4 5 6 7 
3 4 5 
2 3 
1 
0
*/
	public Pattern76(int n) {
		 for(int row=1; row<=n; row++) {
			 for(int column=1; column<=n-row+1; column++ ) {
				 System.out.print((n-row+column)+ " ");
			 }
			 System.out.println();
		 }
	}

}
