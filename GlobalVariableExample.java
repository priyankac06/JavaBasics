package Programs;

public class GlobalVariableExample 
{
int x=100;
static int y=50;
double pi=Math.PI;
void add()
{
	System.out.println(x+y);
}

public static void main(String[] args) 
{
	GlobalVariableExample g1=new GlobalVariableExample();
	g1.add();
	g1.x=250;
	System.out.println(g1.x);
	System.out.println(g1.pi);
	}


}
