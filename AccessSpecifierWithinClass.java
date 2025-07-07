package Programs;

public class AccessSpecifierWithinClass 
{
public static void add()
{
	System.out.println("Addition");
}
protected static void sub()
{
	System.out.println("Subtraction");
}
 static void mul()
{
	System.out.println("Multiplication");
}
private static void div()
{
	System.out.println("Division");
}
public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();

	}

}
