package Programs;

public class LocalVariableExample 
{
static void add()
{
	int a=10;
	int b=20;
	System.out.println(a+b);
}
static void mul()
{
	int a=10;
	int b=20;
	System.out.println(a*b);
}
	public static void main(String[] args) 
	{
		int x=100;
		x=50;
		int y;
		System.out.println(x);
		//System.out.println(y);
		add();
		mul();
	}

}
