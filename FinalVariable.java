package Programs;

public class FinalVariable 
{	
    final static double pi=Math.PI; // global variable
	static void method1()
	{
		final int a=10; //local variable
		//a=25;
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		//pi=5.5;
		System.out.println(pi);
		
	}

}
