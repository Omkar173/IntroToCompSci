import java.util.Scanner;

//Omkar Sahoo
//4-23-2021
//Desc: Creating 4 Right Triangles with asterisks with for-loops
public class E1

{

    public static void main(String[] args)

    {

        Scanner input = new Scanner(System.in);

        int entry = 0;
        int[] totals = new int[21];

        while(entry <= 20 && entry >= 0)
        
        {

            System.out.println("Enter an Integer: ");

            entry = input.nextInt();

            if(entry <= 20 && entry >=0)

            {

                totals[entry]++;

            }

        }

        for(int i = 0; i < totals.length; i++)

        {

            System.out.println(i+": "+totals[i]);

        }

    }

}