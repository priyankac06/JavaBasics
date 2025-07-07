package Programs;
class Registration1
{
	void login()
	{
		System.out.println("Enter Email ID");
	}
}
class Registration2 extends Registration1
{
	void login()
	{
super.login();
		System.out.println("Enter Mobile No");
	}
}
public class OverridingSuperKeyword extends Registration2
{
    void login()
	{
		System.out.println("Registration done");
		super.login();
	}

public static void main(String[] args) 
{
	OverridingSuperKeyword o1=new OverridingSuperKeyword();
	o1.login();
	}

}
