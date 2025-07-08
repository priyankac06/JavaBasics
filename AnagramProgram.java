package ArrayPrograms;
import java.util.Arrays;
public class AnagramProgram {
public static void main(String[] args) 
{// wap to check if the 2strings are anagram
	String a1="earth";
	String a2="heart";
	if(a1.length()!=a2.length())
	{
		System.out.println("They are not anagram");
	}else
	{
	    char c1[]=a1.toCharArray();//c,a,t
		char c2[]=a2.toCharArray();//a,c,t
		Arrays.sort(c1);//a,c,t
		Arrays.sort(c2);//a,c,t
   boolean b2=Arrays.equals(c1, c2);
	if(b2==true)
	{
		System.out.println("Given 2 strings are anagram");
	}
	else
	{
		System.out.println("Given 2 strings are not anagram");
	}	
}}}
