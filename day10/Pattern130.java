package day10;

public class Pattern130 {
/*
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 

*/
	public Pattern130(int n) {
		for(int row=1; row<=n; row++) {
			for(int s=n-1; s>=row; s--) {
				System.out.print(" "); //with out space it print right half pyramid
			}for(int column=1;column<=row; column++) {
				System.out.print(column+ " "); //without space it print left half pyramid
			}
			System.out.println();  //in abouve line if we write space it print triangle
		}
	}

}
