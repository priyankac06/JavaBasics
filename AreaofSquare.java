package Programs;

import java.util.Scanner;

public class AreaofSquare {

	public static void main(String[] args) {
		// Area of Square - a*a
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter length of the square");
		double a=s1.nextDouble();
		double Area = a*a;
		System.out.println(Area);
		s1.close();
		
	}

}
