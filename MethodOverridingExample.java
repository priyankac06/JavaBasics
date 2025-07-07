package Programs;
class GrandParent
{
	void add()
	{
		System.out.println("Addition id not done");
	}
}

class Parent extends GrandParent
{
	void add()
	{
		super.add();
		System.out.println("Addition id not done");
	}
}
public class MethodOverridingExample extends Parent
{

	void add()
	{
		System.out.println("Additions");
	}
	
	public static void main(String[] args) 
	{
		MethodOverridingExample m1=new MethodOverridingExample();
		m1.add();
		
		
		// TODO Auto-generated method stub

	}

}
