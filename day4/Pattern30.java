package day4;

public class Pattern30 {
/*
A B C D E 
F G H I J 
K L M N O 
P Q R S T 
U V W X Y 
Z 

 */

	public Pattern30(int total) {//i'm taking input number here 5
		int row;
		int column;
		char ch = 'A';
		for(row=1; row<=total; row++) {
			for(column=1; column<total; column++) {
				System.out.print(ch+ " ");
				if(ch<'Z') { 
					ch++;
				}else {
					break;
				}
						
	          }
			
			System.out.println();
	      }
		
}
	}
