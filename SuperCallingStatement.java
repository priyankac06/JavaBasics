package Programs;
class Food
{
	Food()
	{
		System.out.println("Food delivery");
	}
}
class Swiggy extends Food
{
	Swiggy()
	{
		
		System.out.println("Delivery - 1");
	}
}
class Zomato extends Swiggy
{
	Zomato(int a)
	{
		super();//you can not write in 2nd line
		System.out.println("Delivery - 2");
		
	}
}

public class SuperCallingStatement extends Zomato
{
	SuperCallingStatement()
	{
		super(10);
		System.out.println("child class");
	}
	
	public static void main(String[] args) 
	{
		new SuperCallingStatement();
	}
}
