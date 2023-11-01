package day5;

public class Pattern32 {
/*
E J O T Y 
D I N S X 
C H M R W 
B G L Q V 
A F K P U 

*pattern14 is same
*/ 

	public Pattern32(int n) {
		char ch =65;
		
		for(int row=1; row<=n; row++) {
			int x = n-row;
			for(int column=1; column<=n; column++) {
				System.out.print((char)(ch+x)+ " ");
				x=x+n;
			}
			System.out.println();
		}
				
	}

}
