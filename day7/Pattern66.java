package day7;

public class Pattern66 {
/*
A 
A B 
A B C 
A B C D 
A B C D E 

*/
	public Pattern66(int n) {
		
		for(int row=1; row<=n; row++) {
			char ch = 65;
			for(int column=1; column<=row; column++) {
				System.out.print((char)ch+ " ");
				ch++;
			}
			
			System.out.println();
		}

	}

}
