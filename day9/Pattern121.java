package day9;

public class Pattern121 {
/*

 1 2 3 4 5
   2 3 4 5
     3 4 5
       4 5
         5

*/
	public Pattern121(int n) {

		
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=n; column++) {
				if(row<=column)
				{
					System.out.printf("%2d", column);
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();

    }
  }
}
