package Programs;

public class NonStaticGlobalVariable {

	 int a=100; //Global + Non-static variable
	 int b=20; //Global + Non-static variable/instance variable

	static void add()   //static method
	{
		NonStaticGlobalVariable g1 = new NonStaticGlobalVariable();	
		System.out.println(g1.a+g1.b);
	}
		
	static void sub()
	{
		NonStaticGlobalVariable g1 = new NonStaticGlobalVariable();	
		System.out.println(g1.a-g1.b);
	}
		
	public static void main(String[] args) 
		{
		NonStaticGlobalVariable g1 = new NonStaticGlobalVariable();	
		System.out.println(g1.a);
	
		add();
		sub();
		}

}
