package Programs;
abstract class AbstractClass
{
   abstract	void login();
   abstract	void logout();
}
public class ConcreteClass extends AbstractClass
{
static void add()
{
	System.out.println("Addition");
}
void sub()
{
	System.out.println("Subtraction");
}	
public static void main(String[] args) 
{
	ConcreteClass c1=new ConcreteClass();
	c1.login();
	c1.logout();
}
void login() 
{
	System.out.println("Login should be done here");
}
void logout() 
{
	System.out.println("Logout should be done here");
}
}
