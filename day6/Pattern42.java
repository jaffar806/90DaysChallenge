package day6;

public class Pattern42 {
/*
 
1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9 

*/
	public Pattern42(int n) {
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=row; column++) {
				System.out.print(row+column-1+ " ");
				
				
			}
			System.out.println();
		
	}

}
}