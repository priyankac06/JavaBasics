package Programs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="madam";
		String output="";
		for(int i=s1.length()-1;i>=0;i--)
			{
			char c1=s1.charAt(i);
		
			//output=output+c1;
			
	}
		//System.out.print(c1);
		System.out.println(output);
		if(s1.equals(output)==true)
		{
			System.out.println("It is palindrome");
		}else
			System.out.println("It is not palindrome");
	    }
	}