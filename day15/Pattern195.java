package day15;

public class Pattern195 {

	public Pattern195(int n) {
		int x=1;
		int y=n*2;
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=n; column++) {
				if(row<=n/2+1) {
					System.out.printf("%2d",x);
				}else {
					System.out.printf("%2d",y);
				}
			}
			System.out.println();
			x=x+2;
			y=y-2;
		}
	}

}
