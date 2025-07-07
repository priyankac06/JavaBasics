package Programs;

public class MethodOverloading 
{
	
	static void add()
	{
		System.out.println("Method Overloading 1");
	}
    static void sub(int a)
    {
		System.out.println("Method Overloading 2");
	}
    void condition(boolean b)
    {
		System.out.println("Method Overloading 3");
	}
	void add(String a ,String b)
	{
		System.out.println("Method Overloading 4");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
add();
sub(120);
MethodOverloading m1 = new MethodOverloading ();
m1.condition(false);
m1.add("amar", "akbar");
	}

}
