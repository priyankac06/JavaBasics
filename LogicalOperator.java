package Programs;

public class LogicalOperator {

	public static void main(String[] args) {
		// Logical Operator - && and ||
		int a=10;
		int b=20;
		int c=30;
		if(a>b && b<c)
		{
			System.out.println("AND operator");
		}
        if(b>c || b==20)
        {
        	System.out.println("OR operator");
        }
        if(!(a==20 && c<a))
        {
        	System.out.println("AND operator will execute");
        }
        if(!(b<c || c>a))
        {
        	System.out.println("OR operator will execute");
        }
	}
	

}
