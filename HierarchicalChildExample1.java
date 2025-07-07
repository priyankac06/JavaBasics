package Programs;
class parent14
{
 void login()
{
System.out.println("Login should be done here");	
}
}
class child2 extends parent14
{
static void logout()
{
System.out.println("Logout should be done here");	
}
}
public class HierarchicalChildExample1 extends parent14
{
public static void main(String[] args) {
	HierarchicalChildExample1 s1=new HierarchicalChildExample1();
	s1.login();


	}

}
