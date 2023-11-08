package day12;

public class Pattern179 {
/*

 A
 B B
 C C C
 D D D D
 E E E
 F F
 G

*/
	public Pattern179(int n) {
		char ch=64;
		int k=0;
		
		for(int row=1; row<=n; row++) {
			for(int column=0; column<=k; column++) {
				System.out.printf("%2c", ch+row);
			}
			if(row<=n/2) {
				k++;
			}else {
				k--;
			}
			System.out.println();
		}
	}

}
