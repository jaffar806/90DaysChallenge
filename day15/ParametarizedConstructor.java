package Basicprograms;

public class ParametarizedConstructor {
 
	public ParametarizedConstructor(int phone) {
		System.out.println("This is your phone number: "+phone);
	}

	public static void main(String[] args) {
		int phone =987456;
		ParametarizedConstructor cl = new ParametarizedConstructor(phone);

	}

}
