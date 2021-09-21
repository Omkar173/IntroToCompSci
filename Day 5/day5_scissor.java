//Omkar
//2-10-2020
//Desc: Split up a single five digit integer

import java.util.Scanner;

public class day5_scissor

{

	public static void main(String[] args)

	{

		Scanner input = new Scanner(System.in);

		//Number and types of variables:

		int num; //user input value
		int output1, output2, output3, output4, output5;

		//Ask the user to type in a number
		
		System.out.println("Enter a 5 digit integer:");
		num = input.nextInt();
		
		//Calculate individual Digits

		output1 = num / 10000;
		output2 = (num % 10000) / 1000;
		output3 = (num % 1000) / 100;
		output4 = (num % 100) / 10;
		output5 = (num % 10) / 1;

		//Print the results

		System.out.println(output1+"	"+output2+"	"+output3+"	"+output4+"	"+output5);		

	}

}