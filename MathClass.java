
package Programs;

public class MathClass 
{
	static void add()
	{
		double pi=Math.PI;
		double radius=23.33;
		double area=pi*radius*radius;
		System.out.println(area);
			
	}

	public static void main(String[] args) 
	{
	// Math Class is predefined class
//Present in Java Lang package	
//Any class which is present in java.lang package need not to be imported.	
//Math class only consist of static methods	
//If you want to access static methods of different class you can use the below syntax:
//ClassName.MethodName();
//Math class is present in java version 1.0	

		System.out.println(Math.addExact(20, 50));
		System.out.println(Math.addExact(200, 3500));
		System.out.println(Math.subtractExact(90, 20));
		System.out.println(Math.subtractExact(6980, 685));
		System.out.println(Math.multiplyExact(25, 54));
		System.out.println(Math.min(29, 90));
		System.out.println(Math.max(29, 90));
		System.out.println(Math.abs(-8514));
		System.out.println(Math.random());
		double pi= Math.PI;
		System.out.println(pi);
		MathClass.add();
		
		
	}

}
