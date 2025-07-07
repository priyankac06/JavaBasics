
package Programs;

public class Constructor 
{
   Constructor()
	{
		System.out.println("Constructor 1");
	}
   
	Constructor(int a)
	{
		System.out.println("Constructor 2");
	}
	public static void main(String[] args) {
//Special types of methods that we have in Java which doesnt have the return type.
		//Constructors can have all access specifier.
		//It should have the same name as classname.
		//It is always non static in nature.
		//It can be both parametrized and non parametrized"	
		//syntax-	class Student - class name
//		{
//			Student() //constructor
//			{
//				
//			}
//		}

		Constructor g1=new Constructor();//syntax-1 -how to call the method
        new Constructor();//syntax-2
	
	
	
	
	
	
	
	}

}
