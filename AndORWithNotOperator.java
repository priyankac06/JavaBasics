package Programs;

public class AndORWithNotOperator 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		 int a=100;
		 int b=20;
		 int c=50;
		 if(!(b>c &&c>b))  //
		 {
			 System.out.println("AND");
		 }
		 if(!(c>b || b>a))
		 {
			 System.out.println("OR");
		 }
		 
		 
	}

}
