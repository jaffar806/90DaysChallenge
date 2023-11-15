package Basicprograms;
abstract class features {
	abstract void call();
	abstract void message();
	abstract void status();
	abstract void search();
	
}class Whatsapp extends features{

	@Override
	void call() {
	System.out.println("click here to call ");
		
	}

	@Override
	void message() {
		System.out.println("click here to message");
		
	}

	@Override
	void status() {
		System.out.println("click here to watch status");
		
	}

	@Override
	void search() {
		System.out.println("click here to search");
		
	}
	
}

public class abst {

	public static void main(String[] args) {
		features call = new Whatsapp();
		call.call();
		call.message();
		call.status();
		call.status();
		

	}

}
