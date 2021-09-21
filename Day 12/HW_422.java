//Omkar
//3-14-2021
//4.22
//Desc: Write a Java application that uses looping to print the following table of values:
//Teammates: Seamus and Tim

public class HW_422

{

	public static void main(String[]args)

	{

        System.out.println("N    10*N    100*N   1000*N");

        int count = 1;

        while(count<=5)

        {

            System.out.println(count +" "+count*10+" "+count*100+" "+count*1000);
            count = count + 1; 

        }

    }

}