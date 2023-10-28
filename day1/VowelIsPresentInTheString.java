package day1;

public class VowelIsPresentInTheString {
//Checking at what index vowel letter is present
	public static void main(String[] args) {
		String name ="jaffar";
			
		for(int i =0; i<name.length(); i ++) {
			if(name.charAt(i) == 'a' || name.charAt(i)== 'e' ||name.charAt(i) == 'i'||name.charAt(i)== 'o' ||name.charAt(i)== 'u') {
				
				System.out.println("In the given String contains "+name.charAt(i)+ " at index"+i);
					
			}
		}

	}

}
