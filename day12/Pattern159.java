package day12;

public class Pattern159 {
/*
         A
       C B A
     E D C B A
   G F E D C B A
 I H G F E D C B A

*/
	public Pattern159(int n) {
		int k=0;
		int s;
		char ch=65; 
		for(int row=1; row<=n; row++) {
			for(s=n-1; s>=row; s--) {
				System.out.print("  ");
			}for(int column=k; column>=0; column--) {
				System.out.printf("%2c",ch+column);
		}
			System.out.println();
			k=k+2;
	}

}
}

