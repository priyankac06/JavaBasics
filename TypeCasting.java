package Programs;

public class TypeCasting 
{
public static void main(String[] args) 
	{
		// int into long-widening
	int a=10;
	long converted_value= a; //implicit syntax
	System.out.println(converted_value);
	long converted_value1=(long) a; //Explicit syntax
	System.out.println(converted_value1);
	
	//byte into double-widening
	byte b=50;
	double converted_value2=b;//implicit syntax
	System.out.println(converted_value2);
	double converted_value3=(double)b;//Explicit syntax
	System.out.println(converted_value3);
	
	//double into int-narrowing
	double c=20.5;
	int value=(int) c;
	System.out.println(value);
	
	//int into byte--narrowing
	int d=200;
	byte value1=(byte)d;
	System.out.println(value1);
	
	

	}

}
