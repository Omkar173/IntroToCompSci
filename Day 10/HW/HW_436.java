//Omkar
//3-4-2021
//4.36
//Desc: Program takes three integers and determines if they form the sides of a right triangle.
//Teammates: Seamus and Tim

import java.util.Scanner;

public class HW_436
{

    public static void main(String[] args)

   {
      Scanner input = new Scanner( System.in );

      int side1; 
      int side2; 
      int side3; 
      boolean RightTriangle_Status; 

      System.out.print( "Input the value for side 1:" );
      side1 = input.nextInt();

      System.out.print( "Input the value for side 2:" );
      side2 = input.nextInt();

      System.out.print( "Input the value for side 3:" );
      side3 = input.nextInt();
      
      int side1Square = side1 * side1;
      int side2Square = side2 * side2;
      int side3Square = side3 * side3;
      
      RightTriangle_Status = false;

      if ( ( side1Square + side2Square ) == side3Square )

        RightTriangle_Status = true;

      else if ( ( side1Square + side3Square ) == side2Square )

        RightTriangle_Status = true;

      else if ( ( side2Square + side3Square ) == side1Square )

        RightTriangle_Status = true;
      
      if (RightTriangle_Status)

         System.out.println( "True" );
      else 
         System.out.println( "False" );      

   } 

} 