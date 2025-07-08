package ArrayPrograms;
import java.util.Arrays;
public class ReverseOneArrayToAnother {
public static void main(String[] args) 
{// Copy one array to another array in reverse order
	int input[]=new int[4];
	input[0]=11;
    input[1]=22;
    input[2]=33;
    input[3]=44;
    int output[]=new int[input.length];
    for(int i=3 , j=0;i>=0;i--,j++)
    {
    	output[j]=input[i];
    }
    System.out.println("The input array is-->"+Arrays.toString(input));
    System.out.println("The output reverse array is-->"+Arrays.toString(output));
	}

}
