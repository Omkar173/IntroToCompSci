import java.util.Scanner;

//Omkar Sahoo
//4-15-2021
/*
(Bar Chart Printing Program) One interesting application of computers is to display graphs and bar charts. 
Write an application that reads five numbers between 1 and 30. 
For each number that’s read, your program should display the same number of adxacent asterisks. 
For example, if your program reads the number 7, it should display *******. 
Display the bars of asterisks after you read all five numbers.
*/

public class HW_516

{

    public static void main(String[] args)

    {

        int numbers[] = new int[5];

        Scanner input = new Scanner(System.in);


        for (int i = 0; i < 5; i++)
        
        {

            System.out.print("Input a number between 1 and 30: ");
            numbers[i] = input.nextInt();

            if(numbers[i] < 1)
            {
                System.out.println("Small Number --> No Number Registered for this entry.");
            }
            if (numbers[i] > 30)
            {
                System.out.println("too big --> No Number Registered for this entry.");
            }

        }
        
        {

            for (int i = 0; i < 5; i++)

            {

                for (int x = 0; x < numbers[i]; x++)
                {

                    System.out.print("*");
                
                }

            }

            System.out.println("");

        }
        
    }
    
}
