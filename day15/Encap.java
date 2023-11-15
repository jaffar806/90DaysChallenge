package Basicprograms;
class enc{
	private int x;
	private String name;
	
	void setpassword(int x) {
		this.x =x;
	}
	public int getpassword() {
		return x;
	}
	
	void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	
}




public class Encap {

	public static void main(String[] args) {
		enc call = new enc();
		call.setpassword(123456789); 
		call.setname("jaffar");
		
		System.out.println(call.getpassword());
        
		System.out.println(call.getname());
		

	}

}
