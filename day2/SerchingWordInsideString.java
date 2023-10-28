package day2;

public class SerchingWordInsideString {

	public static void main(String[] args) {
		//two methods to search word from String
		//1.indexOf
		//2.contains
		
		String sentence = "i will complete all String problems today";
		System.out.println(sentence.indexOf("today"));//it return index of that String
		
		
		int intIndex = sentence.indexOf("will");
		if(intIndex == -1) {
			System.out.println("will not there");
		}else {
			System.out.println("wil is there");
		}
		
		
		System.out.println(sentence.contains("all")); //it return true if it contains inputed String or else it return false
	}

}
