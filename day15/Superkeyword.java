package Basicprograms;
class A{
	int a=10;
	void mehtod1() {
		System.out.println("This is method one statement ");
	}
}
class B extends A{
	void method(){
		System.out.println("I inherited this value from parent class using super keyword "+super.a);
		super.mehtod1();
	}
}




public class Superkeyword {

	public static void main(String[] args) {
		B call = new B();
		call.method();

	}

}
