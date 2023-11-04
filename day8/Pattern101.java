package day8;

public class Pattern101 {

	public Pattern101(int n) {
		for(int row=1; row<=n; row++) {
			
			for(int s=n=1; s>=row; s--) {
				System.out.print(" ");
			}for(int column=1; column<=row; column++) {
				System.out.print(row*2);
				
			}
			System.out.println();
			
			
		}
	}

}
