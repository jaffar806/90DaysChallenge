package day2;

public class RemovingLowerCaseLetter {

	public static void main(String[] args) {
    String sentence = "MY Name is JAffar";
    String nolowercase =sentence.replaceAll("([a-z])",""); //([A-Z]) it remove capital letters
    String sample = sentence.replaceFirst("MY", "my");
    
    System.out.println(nolowercase);
	System.out.println(sample);
	}

}
