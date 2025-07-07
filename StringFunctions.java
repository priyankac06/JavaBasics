package Programs;
public class StringFunctions 
{
public static void main(String[] args) 
	{
	String s1="Priyanka Chavan";
	//length
	int length=s1.length();
	System.out.println("length is--->"+length);
	//uppercase
	String a = s1.toUpperCase();
	System.out.println("Upper Case is--->"+a);
	//lowercase
	System.out.println("Lower Case is--->"+s1.toLowerCase());
	//trim
	String a1="       Hello World Java     ";
	System.out.println("Input is--->"+s1);
	System.out.println("Output is--->"+a1.trim());
	//charAt
	System.out.println("Index is--->"+a1.charAt(13));
	
	


}
}