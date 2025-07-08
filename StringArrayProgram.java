package ArrayPrograms;

import java.util.Arrays;

public class StringArrayProgram {

public static void main(String[] args) 
{
		String name[]=new String[5];
		name[0]="abhyank";
		name[1]="piyu";
		name[2]="abhi";
		name[3]="rajveer";
		name[4]="advait";
		for(int i=0;i<5;i++)
		{
		System.out.println(name[i]);
		
		}
		System.out.println(Arrays.toString(name));
	}

}
