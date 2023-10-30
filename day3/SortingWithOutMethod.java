package day3;

public class SortingWithOutMethod { 
	 
   public static void main(String[] args) {
	int[] aray = {55,1,2,48,2,57,299,1,-65,-2,455,0};
	
	for(int i =0; i<aray.length; i++){
		for(int j = i+1; j<aray.length; j++) {
			int tem = 0; 
			
			if(aray[i]>aray[j]) {
				tem = aray[i];  //storing array value in tem if the condition is true
 				aray[i] = aray[j];
				aray[j] = tem;
			}
			
		}
		System.out.print(aray[i]+ ",");
		
		
		
	}
}
}
