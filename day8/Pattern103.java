package day8;

public class Pattern103 {

	public Pattern103(int n) {
/*
              1
           2  4
        3  6  9
     4  8 12 16
  5 10 15 20 25

*/		
		for(int row=1; row<=n; row++) {
			for(int s=n-1; s>=row; s-- ) {
				System.out.print("   ");//3 space | to print 2 digit number in a right way
			}for(int column=1; column<=row; column++) {
				System.out.printf("%3d", row*column); //1*1--> 2*1 2*2 --> 3*1 3*2 3*3 --> 4*1 4*2 4*3 4*4 4*5
			}
			System.out.println();
		}
	}

}
