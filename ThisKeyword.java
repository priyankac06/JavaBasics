package Programs;

public class ThisKeyword 
{
int stdid; //global variable
double salary;//global variable
String name;//global variable
void studentdetails(int stdid, double salary, String name)
{
	this.stdid=stdid;
	this.salary=salary;
	this.name=name;
}

public static void main(String[] args) 

{
	ThisKeyword  t1=new ThisKeyword ();
	t1.studentdetails(10, 95.0,"piyu");
	System.out.println(t1.stdid);
	System.out.println(t1.salary);
	System.out.println(t1.name);
	

	}

}
