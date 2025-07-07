package Programs;
public class ClassInterface implements InterfaceClass
{
public static void main(String[] args) 
{
	ClassInterface	c1=new ClassInterface();
	c1.add();
	c1.sub();

	}
public void add() 
{
System.out.println("Addition");
	
}
public void sub() 
{
	System.out.println("Division");
}

}
