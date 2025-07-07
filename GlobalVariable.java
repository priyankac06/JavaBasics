package Programs;
public class GlobalVariable 
{
static int a=100; // global variable
static int b=50; 

int x=25; // global+ nonstatic variable
int y=10; //global/instance(global+non-static)

 int days=31;
double pi;
static void add()
{
	System.out.println(a+b);
}
void sub()
{
	System.out.println(a-b);
}
	public static void main(String[] args) 
	{
		//System.out.println(t);
		System.out.println(a);
		GlobalVariable g1=new GlobalVariable();
		System.out.println(g1.days);
		add();
		int days=30;
		System.out.println(days);
		GlobalVariable l1=new GlobalVariable();
		l1.sub();
	}
}
