//Omkar
//3-3-2021
//Description: calculate the average for some number of grades

import java.util.*;

public class CounterGradeAverage
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		//Variables:
		int numGrades;
		double total = 0;
		double average;
		int counter = 1;
		double currentGrade;

		//Enter the number of grades:
		System.out.println("Enter the number of grades: ");
		numGrades = input.nextInt();

		//Loop:
		while(counter <= numGrades)
		{
			//Enter the grade(s):
			System.out.println("Enter the grade: ");
			currentGrade = input.nextDouble();

			//add up all grades:
			total = total + currentGrade;

			//update counter:
			counter = counter + 1;
		}
		//calculate the average:
		average = total / numGrades;

		//printing the average:
		System.out.println("Average: "+average);

	}

}









