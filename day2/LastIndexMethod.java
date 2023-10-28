package day2;

public class LastIndexMethod {

	public static void main(String[] args) {
       String name = new String("md jaffar hussain");
       //finding character index from sting 
       // int s = name.lastIndexOf('f');
      // System.out.println(s);
       
       //you should initialize the sub string before searching the index of string
       //finding String index from String 
       String subname = new String("hussain");

       
       System.out.println(name.indexOf('h'));  //with the help of character finding index
       System.out.println(name.indexOf(subname)); //with the help of substring findex index of String
	}

}
