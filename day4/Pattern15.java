package day4;

public class Pattern15 {
/*
5 6 15 16 25 
4 7 14 17 24 
3 8 13 18 23 
2 9 12 19 22 
1 10 11 20 21 

*/
	public Pattern15(int num) {
		int x,y;
		for(int row=1; row<=num; row++) {
			x=row; //step 1--> x=1
			y=num-row+1;// y=5-1+1;5
			for(int column=1; column<=num; column++) {
				if(column%2==0) { // ==0
					System.out.print(x+ " ");//step-2-->6| Step-4-->16 
				}else {
					System.out.print(y+ " ");  //step-1-->5 | step-3-->15 |step-5-->25
				}
				x=x+num; //x=1+5 =6  | 6+5=11 | 11+5=16 |16+5=21
				y=y+num; //y=5+5= 10 | 10+5=15 | 15+5=20 |20+5=25
			}
			System.out.println();
		}
	}

}
