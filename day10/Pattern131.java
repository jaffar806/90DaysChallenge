package day10;

public class Pattern131 {
/*
    A 
   B B 
  C C C 
 D D D D 
E E E E E 

*/
	public Pattern131(int n) {
		char ch=65;
		for(int row=1; row<=n; row++) {
			for(int s=n-1; s>=row; s--) {
				System.out.print(" "); //with out space it print right half pyramid
			}for(int column=1;column<=row; column++) {
				System.out.print((char)ch+ " "); //without space it print left half pyramid
			}
			ch++;
			System.out.println();  //in abouve line if we write space it print triangle
		}
	}

}
