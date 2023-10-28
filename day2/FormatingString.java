package day2;

public class FormatingString {

	public static void main(String[] args) {
    String name = new String("jafar");
    System.out.format("%s", name); //it print the string value
    
    int rollno = 1642;
    //we can also direct print like this  with out initializing value to variable -->System.out.format("%d" , 1642); 
    System.out.format((String)"%d" , rollno); //converting int to string and printing using format 
	
	
	//there are many format specifier 
	
	
	}

}
