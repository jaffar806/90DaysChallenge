package day5;

public class Pattern33 {

	public Pattern33(int n) {
		
			char ch =65;
			
			for(int row=1; row<=n; row++) {
			    int x=ch+row-1;
				for(int column=1; column<=n; column++) {
					System.out.print((char)ch+ " ");
					ch =(char) (ch +n);
				}
				System.out.println();
			}
		
	}

}
