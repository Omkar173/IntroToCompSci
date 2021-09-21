//Omkar
//2-10-2021
//Description: Quadratic Formula Solver

import java.util.Scanner;

public class day5_QuadSolve

{

	public static void main(String[] args)

	{

		Scanner input = new Scanner(System.in);

		//determine variables:

		double a, b, c;
		double discriminant; //b^2 - 4ac
		double x1, x2;
		
		//ask the user for a,b,c:

		System.out.println("Enter a, b, and c:");

		//allow the user to enter a,b,c:

		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();

		//use quadratic formula with a,b,c values:

		x1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
		x2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);

		//print out results:

		System.out.println("x = "+x1+" and "+x2);

	}

}