package Programs;

public class ConstructorOverloadExample
{

	static void add()
	{
		System.out.println("Addition");
	}
	void sub()
	{
		System.out.println("subtraction");
	}
	ConstructorOverloadExample()
	{
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add();
ConstructorOverloadExample a1=new ConstructorOverloadExample();
a1.sub();
		
		
		
		
		
		
	}

}
