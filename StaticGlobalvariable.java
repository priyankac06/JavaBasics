package Programs;

public class StaticGlobalvariable
{
static int a=100; //Global + static variable
static int b=20; //Global + static variable
//Global variable can utilized in static method as well as main method

static void add()   //static method
{
	sub();
	System.out.println(a+b);
}
	
static void sub()
{
	System.out.println(a-b);
}
	
	public static void main(String[] args) {
		System.out.println(a);
		add();
		//sub();
	}

}
