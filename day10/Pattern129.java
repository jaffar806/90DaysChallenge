package day10;

public class Pattern129 {
/*
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 


*/
	public Pattern129(int n) {
		for(int row=1; row<=n; row++) {
		for(int s=n-1; s>=row; s--) {
			System.out.print(" "); //with out space it print right half pyramid
		}for(int column=1;column<=row; column++) {
			System.out.print(row+ " "); //without space it print left half pyramid
		}
		System.out.println();  //in abouve line if we write space it print triangle
	}

	}

}
