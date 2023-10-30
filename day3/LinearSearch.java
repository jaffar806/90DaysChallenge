package day3;

public class LinearSearch {

	public static void main(String[] args) {
     String[] name = {"jafar", "munawar", "baba", "Aammi", "husain", "dadi"};
     
     String target = "Aammi"; 
     for (int i = 0; i < name.length; i++) {
		if(name[i] == target) {
			System.out.println("Aammi is there inside the list ");
			break;
		}else {
			System.out.println("Aammi is not there inside the list ");
			break;
		}
	}
 
	}

}
