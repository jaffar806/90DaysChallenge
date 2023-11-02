package day6;

public class Pattern43 {

	public Pattern43(int n) {
		
		for(int row=1; row<=n; row++) {
			int x=row-1;
			for(int column=1; column<=row; column++) {
				System.out.print((x+row)+ " ");
				x=x+2;;
			}
			System.out.println();
	}

}
	}
