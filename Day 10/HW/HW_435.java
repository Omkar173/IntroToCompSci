//Omkar
//3-4-2021
//4.35
//Desc: Write a Program that takes three values and determines if they form the sides of a triangle.
//Teammates: Seamus and Tim

import java.util.Scanner;

public class HW_435

{
   
    public static void main(String[] args)

   {
    
      Scanner input = new Scanner( System.in );
 
      double side1; 
      double side2; 
      double side3; 
      boolean Triangle_Status; 

      System.out.println( "Input the value for side 1:" );
      side1 = input.nextDouble();

      System.out.println( "Input the value for side 2:" );
      side2 = input.nextDouble();

      System.out.println( "Input the value for side 3:" );
      side3 = input.nextDouble();

      Triangle_Status = false;
      
      if ( side1 + side2 > side3 )

      {

         if ( side2 + side3 > side1 )

         {

            if ( side3 + side1 > side2 )
            Triangle_Status = true;

         }

      } 
      
      if ( Triangle_Status )
         System.out.println( "True. THIS IS A TRIANGLE!!!" );

      else 
         System.out.println( "False. what is this? Not a triangle?" );

   }

}