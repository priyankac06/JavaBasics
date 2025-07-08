package ArrayPrograms;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayAtRuntime {
public static void main(String[] args)
{// Wap to accept the values of array at runtime in string datatype
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	String name[]=new String[s1.nextInt()];
	for(int i=0;i<name.length;i++)
	{
	System.out.println("Enter the value of index->"+i);
	name[i]=s1.next();
	}
s1.close();
System.out.println(Arrays.toString(name));
	}}
