package Programs;
class Single
{
	static void add()
	{
		System.out.println("Addition");
	}
	void mul()
	{
		System.out.println("Multiplication");
	}
}
public class SinglelevelInheritance extends Single
{
	static void login()
	{
		System.out.println("Enter ID");
	}
	void password()
	{
		System.out.println("Enter password");
	}
	public static void main(String[] args) {
		 login();
		 SinglelevelInheritance s1= new SinglelevelInheritance();
		 s1.password();
		 s1.mul();
		 
	}

}
