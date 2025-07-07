package Programs;

public class GlobalLocalVariable 
{
  int a=100; // non-static variable/instance variable
  static int days=30; //static variable
   //static boolean b;
	public static void main(String[] args) 
{
 // How to update the value of local variable
	int a=100;
	a=120;
	System.out.println(a);
	
	// How to update the value of global variable
	days=31;
	System.out.println(days);
	GlobalLocalVariable g1=new GlobalLocalVariable();
	g1.a=200;
	System.out.println(g1.a);
	//System.out.println(b);
	
	
	
	
	}

}
