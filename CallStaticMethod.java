package Programs;

public class CallStaticMethod 
{
 
 static void registration()
 {
	 System.out.println("Registration is done");
 }
 static void login()
 {
	 System.out.println("Enter username");
 }
 
 static void logout()
 {
	 login(); 
	 System.out.println("Enter logout button");
 }
 
	public static void main(String[] args) 
	{
		// call static method in main method by its name
		//we can call static method 2-3 times
//We can call static method(login()) in static also, 
//first will execute login then will execute logout() 

		
		registration();
		//login();
		logout();

	}

}
