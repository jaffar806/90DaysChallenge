package day4;

public class Pattern12 {
/*
1 6 11 16 21 
2 7 12 17 22 
3 8 13 18 23 
4 9 14 19 24 
5 10 15 20 25 
*/
	
  public Pattern12(int num) {
	  int increm;
	for(int row =1; row<=num; row++) {
		increm =row; //it will print what ever the row value at the first line
		for(int column=1; column<=num; column++) {
			System.out.print(increm+ " ");
			increm = increm+num;
		}
		System.out.println();
	}
  }


}
