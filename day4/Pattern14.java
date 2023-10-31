package day4;

public class Pattern14 {
/*
5 10 15 20 25 30
4 9 14 19 24 29
3 8 13 18 23 28
2 7 12 17 22 27
1 6 11 16 21 26

*/

	public Pattern14(int num) {
		int x;
		for(int row=1; row<=num; row++) {
			x = num-row+1; //this logic is important
			for(int column=1; column<=num; column++) {
				System.out.print(x+ " ");
				x= x+num;
			}
			System.out.println(x);
		}
	}

}
