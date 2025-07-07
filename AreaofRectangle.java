package Programs;

import java.util.Scanner;

public class AreaofRectangle {

	public static void main(String[] args) {
		// Area of Rectangle - a*b
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter length of the rectangle a");
		double a=s1.nextDouble();
		System.out.println("Enter length of the rectangle b");
		double b=s1.nextDouble();
		double Area = a*b;
		System.out.println(Area);
		s1.close();
	}

}
