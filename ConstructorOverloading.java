package Programs;

public class ConstructorOverloading 
{
	ConstructorOverloading(char a)
	{
		System.out.println("Constructor ");
	}
	ConstructorOverloading(int a)
	{
		System.out.println("Constructor 1");
	}
	ConstructorOverloading(int b,char a, String name)
	{
		System.out.println("Constructor 2");
	}
	ConstructorOverloading(boolean a)
	{
		System.out.println("Constructor 3");
	}
	public static void main(String[] args) {
	//Developing multiple constructor but wuth different argumnet lists is called as CO.
//Note:
//1. Make sure to use different arguments of different datatypes
//2. Make sure to use different number of arguments in each methods."	
		
		
		
ConstructorOverloading g1 = new ConstructorOverloading('A'); //syntax-1-to call the method
	new ConstructorOverloading(50); //syntax-2
	new ConstructorOverloading(100,'A',"piyu");
	new ConstructorOverloading(true);
	}

}
