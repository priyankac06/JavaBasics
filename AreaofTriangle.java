package Programs;

import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {
		// AreaofTriangle - 0.5*b*h
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the base of the triangle");
double b = s1.nextDouble();
System.out.println("Enter the height of the triangle");
double h = s1.nextDouble();
double area = 05.*b*h;
System.out.println(area);
s1.close();
	}

}
