package Programs;

import java.util.Scanner;

public class CircumferenceofSquare {

	public static void main(String[] args) {
		// Circumference of Square - 4*a
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the length of a");
		double a = s1.nextDouble();
		double Circumference = 4*a;
		System.out.println("Circumference of Square-->"+Circumference);
		s1.close();

	}

}
