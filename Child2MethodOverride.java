package Programs;

public class Child2MethodOverride extends Parent1MethodOverride
{
	void Registration()
	{
		System.out.println("Enter login button");
	}
	
	
	public static void main(String[] args) 
	{
		Child1MethodOverride c1=new Child1MethodOverride();
		c1.Registration();
	}

}
