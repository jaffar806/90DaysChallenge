package day4;

public class pattern6{ 
/*
1 2 3 4 5 
6 7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25 
*/
   public pattern6(int num) {
	   int counter=1;
	   for(int row=1; row<=num; row++) {
		   for(int column=1; column<=num; column++) {
			   System.out.print(counter+ " ");
               counter++;   
		   }
		   System.out.println();
	   }
   }
 

}
