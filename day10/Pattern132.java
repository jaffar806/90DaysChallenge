package day10;

public class Pattern132 {
/*
    A 
   A B 
  A B C 
 A B C D 
A B C D E 

*/
	public Pattern132(int n) {
		char ch=65;
		for(int row=1; row<=n; row++) {
			for(int s=n-1; s>=row; s--) {
				System.out.print(" "); //with out space it print right half pyramid
			}for(int column=0;column<row; column++) {
				System.out.print((char)(ch+column)+ " "); //without space it print left half pyramid
			}
			
			System.out.println();  //in abouve line if we write space it print triangle
		}
	}

}
