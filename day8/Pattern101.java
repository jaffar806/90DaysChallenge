package day8;

public class Pattern101 {
/*
              2
           4  6
        8 10 12
    14 16 18 20
 22 24 26 28 30

*/
	public Pattern101(int n) {
		/*int k=2; //initializing 2 to print even numbers
		for(int row=1; row<=n; row++) {
			
			for(int s=n-1; s>=row; s--) {
				System.out.print(" ");
			}for(int column=1; column<=row; column++) {
				System.out.print(k);
				k=k+2; //adding 2 to k in every next step
				
			}
			System.out.println();
			
		*/
		int x=2; //this is using if else 
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=n; j++) {
				if(i<=j) {
					System.out.printf("%3d",x);
					x=x+2;
				}else {
					System.out.print("   "); //three times space
				}
			}
			System.out.println();
		}
	
	
	
	}
}


