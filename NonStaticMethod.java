package Programs;

public class NonStaticMethod 
{

	 static void add()
     {
	System.out.println("Addition");
     }
	 static void sub(int a)
     {
	System.out.println("Subtraction");
     }
	 static void login(String a)
	 {
		 System.out.println("Enter Name");
	 }
	 static void password(int a)
	 {
		 System.out.println("Enter password");
	 }
	 static void mul(double a)
	 {
		 System.out.println("Multiplication");
	 }
	
	
	
	public static void main(String[] args) {
		// Create an object to call non-static method
		//Syntax: ClassName variable = new ClassName();
		//we can call the method with the help of reference variable
		//variable.nonstaticmethod();
		NonStaticMethod a = new NonStaticMethod();
	    add();
	    sub(50);
	    login("priyanka");
	   password(123456);
	   mul(88.29);
	     
		
	}

}
