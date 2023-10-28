package day2;

public class SubStringmethod {

	public static void main(String[] args) {
    String college = "muffakham jah colloege of engineering and technology";
    
    System.out.println(college.substring(9)); //it print college name from 9 index
    System.out.println(college.substring(9, 37)); //it print college name from 9 index and print till 37 th index
    System.out.println(college.substring(college.length() - 11)); //it print last 11 index value

	}

}
