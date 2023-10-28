package day2;

public class RregionMatches {

	public static void main(String[] args) {
    //Following example determines region matchs in two strings by using regionMatches() method
		String string1 = "my name is jaffar";
		String string2 = "they call me jaffar";
		
		System.out.println(string1.regionMatches(11, string2,13 , 6)); //it returns true if 6 indexes are same in both string
		//11 starts from j in string1
		//13 starts from j in string2
		//6 how many indexes should i compare

	}

}
