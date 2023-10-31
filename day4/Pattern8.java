package day4;
/*
2 4 6 8 10 
12 14 16 18 20 
22 24 26 28 30 
32 34 36 38 40 
42 44 46 48 50 
*/
public class Pattern8 {
public Pattern8(int num) {
	int increment =2; //printing even numbers so i written 2 (you should write this line outside of two loops )
	for(int row=1; row<=num; row++) {
		
		for(int column =1; column<=num; column++) {
			System.out.print(increment+ " ");
			increment+=2; //i =i+2;
		}
		System.out.println();
		
	}
}
}
