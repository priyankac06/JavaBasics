package ArrayPrograms;
import java.util.Arrays;
public class CopyOneArrayToAnother {
public static void main(String[] args)
{// Wap to copy one array to another array
	//input[11,22,33,44]
	//output[11,22,33,44]
	int input[]=new int[4];
	input[0]=11;
	input[1]=22;
	input[2]=33;
	input[3]=44;
	int output[]=new int[input.length];
	for(int i=0;i<input.length;i++) 
	{
	output[i]=input[i];
	}
System.out.println("The input array is->"+Arrays.toString(input));
System.out.println("The output array is->"+Arrays.toString(output));
}}