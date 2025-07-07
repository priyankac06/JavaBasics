package Programs;
public class ConstructorsThisCallingStatement 
{
	ConstructorsThisCallingStatement()
	{
		System.out.println("1");
	}
	ConstructorsThisCallingStatement(int a)
	{
		this();
		System.out.println("2");
	}
	ConstructorsThisCallingStatement(String name)
	{
		this(20);
		System.out.println("3");
	}
	ConstructorsThisCallingStatement(boolean a)
	{
		this("ab");
		System.out.println("4");
	}
public static void main(String[] args) 
	{
    new ConstructorsThisCallingStatement(true);
	}

}
