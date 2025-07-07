package Programs;

public class InterfaceClass2  implements Interface2
{

public static void main(String[] args) {
	InterfaceClass2 i1=new InterfaceClass2();
	i1.login();
	i1.logout();

	}

@Override
public void login() 
{
	System.out.println("Login is done");
	
}

@Override
public void logout() 
{
	System.out.println("Logout is done");
	
}

}
