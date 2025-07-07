package Programs;
class parent1
{
	static void login3() 
	{
		System.out.println("Registration is done");
	}
}
class parent2 extends parent1
{
	static void login2() 
	{
		System.out.println("Enter login button");
	}
}
class parent3 extends parent2
{
	static void login1() 
	{
		System.out.println("Enter Password");
	}
}
public class MultiLevelChildExample1 extends parent3
{
static void login()
{
	System.out.println("Enter ID");
}
public static void main(String[] args)
	{
		login();
		login1();
		login2();
		login3();
	}

}
