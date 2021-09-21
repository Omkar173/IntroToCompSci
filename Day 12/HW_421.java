//Omkar
//3-14-2021
//4.21
//Desc: Write a Java application that lets user input 10 numbers. 
//      Then it should determine and print the largest number. 23
//Teammates: Seamus and Tim

import java.util.Scanner;

public class HW_421

{
    public static void main(String[] args)

    {
        
        int i = 1;

        int num;

        Scanner input = new Scanner(System.in);
    
        int bigNum = 0;
    
        while(i <= 10)

        {

            System.out.println("Input a number: ");

            num = input.nextInt();

            if(bigNum <num)

                bigNum = num;

            i= i+1;

        }

        System.out.println("The biggest number is :" +bigNum);
    }

}