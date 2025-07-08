package ArrayPrograms;

import java.util.Arrays;

public class ArraySortAndTostring 
{
public static void main(String[] args)
{
// WAP on Array Function using Arrays.toString and Arrays.sort concept
	String s1="careful";
	char c1[]=s1.toCharArray();
	System.out.println(Arrays.toString(c1));
//	String s2="Wonderful";
//	char c2[]=s2.toCharArray();
	Arrays.sort(c1);
	System.out.println("After sorting the value-->"+Arrays.toString(c1));

}
}
