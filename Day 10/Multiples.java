//Omkar
//3-3-2021
//Description: The program will introduce counter controlled loops.
//We will print out a table of multiples in an effient way

public class Multiples

{

    public static void main(String[] args)

    {

        //Notes:
        /*
            Counter Controlled Loop: Have a counter tht lets us know how many times to do an action

            3 Parts:
            1) A counter variable that starts at an initial value.
            2) A loop that checks the counter against a limiting value
            3) change counter variable to approach the limit
            ** if you forget step 3, you will get an infinite loop **
        */

        int count = 0;

        while(count<10)

        {

            System.out.println(count +" "+count*10+" "+count*100);
            count = count + 1; //change the count variable towards the limit
            

        }

    }

}