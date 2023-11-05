package day9;

public class Pattern108 {
/*
              1
           6  2
       10  7  3
    13 11  8  4
 15 14 12  9  5

*/
	public Pattern108(int n) {
		int x=1; //Initialzing 1 to to print the number inside 1 row
		int t,y;
		for(int row=n; row>=1; row--) {
			y=row; 
			t=x;
			for(int s=1; s<row; s++) {
				System.out.print("   ");
			}for(int column=n; column>=row; column--) {
				System.out.printf("%3d", t); //1 
				t=t-y;//6-4=2 10-3=7  
				y++;
			}
			x=x+row; //1+5=6;  6+4=10; 10+3=13; 13+2=15
			System.out.println();
		}
	}

}
