//Omkar
//2-4-2021
//Description: Basic math with Variables and Unser Interactivity

//import any classes we want to use:
import java.util.Scanner;

public class Calculator

{

	public static void main(String[] args)

	{

		//set up our Scanner object - this is used to allow the user to type
		Scanner input = new Scanner(System.in);

		//create two integer variables:
		//type name;

		int num1;
		int num2;


		//Give the user directions:
		System.out.println("Enter two integers: ");


		//initialize variable to be whatever the user types
		num1 = input.nextInt();
		num2 = input.nextInt();  //variable left, value right

		//5 basic math operations:
		int sum = num1 + num2; //addition
		int diff =  num1 - num2; //subtraction
		int prod =  num1 * num2; //multiplication

		System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
		System.out.println("The diff of "+num1+" and "+num2+" is "+diff);
		System.out.println("The prod of "+num1+" and "+num2+" is "+prod);
		System.out.println("The quot of "+num1+" and "+num2+" is "+quot);
		System.out.println("The mod of "+num1+" and "+num2+" is "+mod);

		if(num2 != 0)
		
		{

			int quot = num1 / num2; //division
			int mod = num1 % num2; //remainder
			System.out.println("The quot of "+num1+" and "+num2+" is "+quot)
			System.out.println("The mod of "+num1+" and "+num2+" is "+mod) 
		
		}
	
	}

}