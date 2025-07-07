package Programs;

public class LocalVariable 
{
	static void add() // static method
    {
	int a=10; // local variable
	int b=20;
	System.out.println(a+b);
    }
	void sub() // non-static method
	{
		int a=90; // local variable
		int b=20;
		System.out.println(a-b);
	}
	public static void main(String[] args) 
	{
    int a;
    a=10; // local variable //declare and initiliaze
    System.out.println(a); //it must utilized	
	add();	
	
	LocalVariable l1=new LocalVariable ();
	l1.sub();
	}

}
