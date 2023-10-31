package day4;

public class Pattern13 {



	public Pattern13(int num) {
		  int i,y;
			for(int row =1; row<=num; row++) {
				i =row; //it will print what ever the row value at the first line
				y=num-i+1;
				for(int column=1; column<=num; column++) {
					if(column%2==1) {
						System.out.print(i+ " ");
					}else {
						System.out.print(y+ " ");
					}
					i=i+num;
					y=y+num;
				}
				System.out.println();
			}
	                                                    }

}
