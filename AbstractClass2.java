package Programs;
abstract class AbstractClass1
{
	abstract void login();
	abstract void logout();
}
public class AbstractClass2 extends AbstractClass1
{
public static void main(String[] args) 
{
	AbstractClass2 a1=new AbstractClass2();
	a1.login();
	a1.logout();
}
@Override
void login() 
{
	System.out.println("Enter ID and Password");
}
@Override
void logout() 
{
	System.out.println("Enter Logout button");
}
}
