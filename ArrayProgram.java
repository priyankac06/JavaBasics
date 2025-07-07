package Programs;

import java.util.Arrays;

public class ArrayProgram {

	public static void main(String[] args) 
	{
	int []input=new int[4];
	input[0]=78;
			input[1]=74;
			input[2]=15;
			input[3]=10;
	int [] output=new int[input.length];
	for(int i=0;i<input.length;i++)
	{
	output[i]=input[i];
	}
	System.out.println("The input ARray is:-> "+Arrays.toString(input));	
	System.out.println("The output ARray is:-> "+Arrays.toString(output));	

	}

}
