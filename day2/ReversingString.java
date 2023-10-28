package day2;

public class ReversingString {

	public static void main(String[] args) {
    String name = "jaffar";
    //Reversing String using StringBuffer
    String new1 = new  StringBuffer(name).reverse().toString();
    System.out.println(new1);
	}

}
