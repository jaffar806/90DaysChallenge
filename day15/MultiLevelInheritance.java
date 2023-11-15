package Basicprograms;
class Monday{
	void folder1() {
        System.out.println("10 files created on monday in folder 1");
   }
	void folder2() {
		System.out.println("5  files created on monday in folder 2");
	}
}

class Tuesday extends Monday{
	void folder3() {
		System.out.println("20 files created on Tuesday in folder 3");
	}
}
class wenesday extends Tuesday{
	void folder4() {
		System.out.println("6  files created on wenesday in folder 4");
	}
}

	


public class MultiLevelInheritance {

	public static void main(String[] args) {
    wenesday call = new wenesday();	
    call.folder1();
    call.folder2();
    call.folder3();
    call.folder4();
    
    
 
	}


}