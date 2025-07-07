package Programs;

public class Child1MethodOverride extends Parent1MethodOverride
{

	void Registration()
	{
		System.out.println("Enter Password");
	}
	
	
	public static void main(String[] args) 
	{
		Child1MethodOverride c1=new Child1MethodOverride();
		c1.Registration();
	}

}
