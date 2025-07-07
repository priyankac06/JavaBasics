package Programs;

import java.util.Scanner;

public class CircumferenceofTriangle {

	public static void main(String[] args) {
		// Circumference of Triangle - a+b+c
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a = s1.nextDouble();
		System.out.println("Enter the value of b");
		double b = s1.nextDouble();
		System.out.println("Enter the value of c ");
		double c = s1.nextDouble();
		double Circumference = a+b+c;
		System.out.println(Circumference);
		s1.close();
		

	}

}
