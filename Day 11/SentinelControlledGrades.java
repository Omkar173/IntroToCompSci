//Omkar
//2-24-2021
//Desc: Create a grade average calculator that lets the user stop inputting grades whenever they want

import java.util.Scanner;

public class SentinelControlledGrades

{

	public static void main(String[]args)

	{

        Scanner input = new Scanner(System.in);

        //Create Variables:
        int numGrades = 0;
        double currentGrade = 0;
        double average;
        double total = 0;

        //Create Our Sentinel Controlled Loop
        //Want to give user option to end program
        //Usually a value outside the range of what makes sense

        while(currentGrade >= 0)
        {

            //repeated code here
            System.out.println("Enter a grade (-1 to stop): ");
            currentGrade = input.nextDouble();

            if(currentGrade >= 0)
            
            {

                total += currentGrade; //same as: total = total + currentGrade;

                numGrades++; //same as: numGrades = numGrades +1; or numGrades += 1;

            }

        }

       // System.out.println("Total: "+total);
       // System.out.println("Number of Grades: "+numGrades);

       average = total / numGrades;
       System.out.println("Average: "+average);

    }

}