package Programs;

public class ChildClass extends ParentClass
{
static void div()//static method
{
	System.out.println("Division");
}
void login() //non-static method
{
	System.out.println("Email ID is mandatory");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   add();
   div();		
   ChildClass c1=new ChildClass();
   c1.login();
   c1.mul();
	}
	}
