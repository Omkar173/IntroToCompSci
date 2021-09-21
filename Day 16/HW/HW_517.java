import java.util.Scanner;

//Omkar Sahoo
//4-15-2021
/*
(Calculating Sales) An online retailer sells five products whose retail prices are as follows:
Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
Write an application that reads a series of pairs of numbers as follows:
a) product number
b) quantity sold
Your program should use a switch statement to determine the retail price for each product. It
should calculate and display the total retail value of all products sold. Use a sentinel-controlled
loop to determine when the program should stop looping and display the final results.
*/

public class HW_517

{

    public static void main(String[] args)

    {
        Scanner input = new Scanner( System.in );

        double TotalPrice = 0;

        while(true)

        {

            System.out.println("product 1, $2.98");
            System.out.println("product 2, $4.50");
            System.out.println("product 3, $9.98");
            System.out.println("product 4, $4.49");
            System.out.println("product 5, $6.87");
            System.out.println("Type -1 to exit program");
            System.out.println("Enter the number of the product you want: ");

            int ProductNum = input.nextInt();

            if (ProductNum==-1)
            {
                break;  
            }

            System.out.print("Enter quantity sold: ");
            int TotalSold = input.nextInt();

            switch(ProductNum)

            {

                case 1:
                    TotalPrice+=2.98*TotalSold;
                    break;
                case 2:
                    TotalPrice+=4.50*TotalSold;
                    break;
                case 3:
                    TotalPrice+=9.98*TotalSold;
                    break;
                case 4:
                    TotalPrice+=4.49*TotalSold;
                    break;
                case 5:
                    TotalPrice+=6.87*TotalSold;
                    break;

            }

            System.out.println("The total price is " +TotalPrice+ " dollars");
            System.out.println("---------------------------");

        } 

    }
    
}