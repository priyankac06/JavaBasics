package Programs;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayHumanInput 
{
public static void main(String[] args)
{
Scanner s1=new Scanner(System.in);
System.out.println("Enter size of the array--->");
String []name=new String[s1.nextInt()];
	for(int i=0;i<name.length;i++)
{
System.out.println("Please enter the value of of index--->"+i);
         name[i]=s1.next();
		}
	System.out.println(Arrays.toString(name));
s1.close();
	}

}
