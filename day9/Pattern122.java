package day9;

public class Pattern122 {
/*
 5 4 3 2 1
   4 3 2 1
     3 2 1
       2 1
         1

*/
	public Pattern122(int n) {
		for(int row=n; row>0; row--) {
			for(int column=n; column>0; column--) { //c=5 c=4 c=3 c=2 c=1
				if(row>=column) //5>5 5>4 5>3 5>2 5>1
				{
					System.out.printf("%2d", column);
				}else {
					System.out.print("  "); //because of the %2d i added two spaces
				}
			}
			System.out.println();

	}

}
}
