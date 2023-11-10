package day13;

public class Pattern183 {
/*
         1
       2 2
     3 3 3
   4 4 4 4
 5 5 5 5 5
   6 6 6 6
     7 7 7
       8 8
         9

*/
	public Pattern183(int n) {
		int x=n/2;
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=n/2+1; column++) 
			{
				if(column <= x) 
				{
					System.out.print("  ");
				}else {
					System.out.printf("%2d", row);
				}
					
			}
			if(row<=n/2) {
				x--; 
			}else {
				x++;
			}
			System.out.println();
		}
	}

}
