package ArrayPrograms;
public class CalculateAverageOfArray 
{
public static void main(String[] args) 
{
	//6,12,18,24
//Wap to find out the average of all the values present in the array
	int nos[]=new int[4];
	nos[0]=6;
	nos[1]=12;
	nos[2]=18;
	nos[3]=24;
	int sum=0;
	for(int i=0;i<4;i++)
	{
		sum=sum+nos[i];
	}
	System.out.println(sum);
	double average=sum/nos.length;
	System.out.println(average);
	
	
	
	
	
	
	
	
	
	
	
	}

}
