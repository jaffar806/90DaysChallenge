package day1;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int[] a = {2,45,25,11,456};
		
		int max = a[0];
		
		for (int i = 0; i<a.length; i++) {
			if(a[i] > max) {
				max =a[i];
			}
		}System.out.println(max);			
	}

}
