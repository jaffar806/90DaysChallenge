package Basicprograms;

public class Class1 {
  public String name;
  public int roll; 
  
 /*Class1(){
	  
	  System.out.println("This is default constructor ");
	  System.out.println("displaying default construtor values: "+name+ " "+roll);
  }*/
  public Class1() {
     name= "munawar";  
  }
  
  void method1() {
	  System.out.println("this is method one: ");
  }
  void method2(String name, int roll) {
	  this.name = name; 
	  this.roll = roll;
	  
	  System.out.println("my name is "+name+" my roll number is "+roll);
  }
  
  
  void method3(){
	  System.out.println(name+ " is a programer");
	  System.out.println(roll+ " his roll number");
  }
}
