package Programs;

import java.util.Scanner;

public class CircumferenceofCircle {

	public static void main(String[] args) {
		// Circumference of Circle - 2*pi*r
		
		//double pi= Math.PI;
		System.out.println("Please enter the radius of the circle");
Scanner s1=new Scanner(System.in);
double r= s1.nextDouble();
double circumferance = 2*Math.PI*r;
System.out.println("Area of circumferance-->"+ circumferance);
s1.close();
	}

}
