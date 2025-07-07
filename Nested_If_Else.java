package Programs;

public class Nested_If_Else {

	public static void main(String[] args) {
		// Nested If Else
		int a=10;
		int b=20;
		int c=30;
		
		if(a<b)
		{
			if(a<c)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("2");
			}
		}
		else
		{
			System.out.println("3");
		}

	}

}
