package day4;

public class Pattern7 {
/*
1 3 5 7 9 
11 13 15 17 19 
21 23 25 27 29 
31 33 35 37 39 
41 43 45 47 49 
*/
	public Pattern7(int num) {
		int increment =1;  //this is the important condition
		for(int row=1; row<=num; row++) {
			for(int column=1; column<=num; column++ ) {
				System.out.print(increment+ " ");
				increment+=2; //i=i+2; this one is important condition
			}
System.out.println();
		}
	}

}
