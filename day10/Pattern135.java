package day10;
/*
5 4 3 2 1 
 4 3 2 1 
  3 2 1 
   2 1 
    1 

*/
public class Pattern135 {

	public Pattern135(int n) {
		for(int row=n; row>0; row--) {
			for(int s=n-1; s>=row; s--){
				System.out.print(" ");
			}for(int column=row; column>=1; column--) {
				System.out.print(column+" ");
			}
			
			System.out.println();
		}
	}

}
