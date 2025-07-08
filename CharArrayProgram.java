package ArrayPrograms;

import java.util.Arrays;

public class CharArrayProgram 
{
public static void main(String[] args) 
{
		char letter[]=new char[5];
		letter[0]='a';
		letter[1]='b';
		letter[2]='h';
		letter[3]='y';
		letter[4]='k';
		for(int i=0;i<5;i++)
		{
			System.out.println(letter[i]);
		}
		System.out.println(Arrays.toString(letter));
	}

}
