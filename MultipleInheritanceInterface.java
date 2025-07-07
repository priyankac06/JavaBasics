package Programs;
interface One
{
	void Method1();
}
interface Two
{
	void Method2();
}
interface Three
{
	void Method3();
}
public class MultipleInheritanceInterface implements Three,Two,One
{
public static void main(String[] args)
{
	MultipleInheritanceInterface m1=new MultipleInheritanceInterface();
	m1.Method1();
	m1.Method2();
	m1.Method3();
}
public void Method1() 
{
	System.out.println("Method-1 implementation");
}
public void Method2() 
{
	System.out.println("Method-2 implementation");
}
public void Method3() 
{
   System.out.println("Method-3 implementation");
}

}
