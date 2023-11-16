package day15;

public class Pattern200 {

	public Pattern200(int n) {
	  int x=1;
	  for(int i=1; i<=n; i++) {
		  for(int j=1; j<=n; j++) {
			  System.out.printf("%5s",Integer.toBinaryString(x));
			  x++;
		  }
		  System.out.println();
	  }
	}

}
