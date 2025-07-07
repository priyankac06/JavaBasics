package Programs;

public class ThisCallingStatement 
{
	ThisCallingStatement (String name)
	{
		System.out.println("3");
	}
	
	ThisCallingStatement ()
	{
		this("mkt");
		System.out.println("2");
	}
	
	ThisCallingStatement (int a)
	{
		this();
		System.out.println("1");
	}

	public static void main(String[] args) {
		new ThisCallingStatement (20);

	}

}