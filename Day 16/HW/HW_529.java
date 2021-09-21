//Omkar Sahoo
//4-15-2021

/*
(“The Twelve Days of Christmas” Song) Write an application that uses repetition and
switch statements to print the song “The Twelve Days of Christmas.” One switch statement should
be used to print the day (“first,” “second,” and so on). A separate switch statement should be used
to print the remainder of each verse. Visit the website en.wikipedia.org/wiki/The_Twelve_Days_
of_Christmas_(song) for the lyrics of the song.
*/

public class HW_529 

{
    
    public static void main(String[] args)

    {

        for (int Day = 1; Day <= 12; Day++)

        {

            System.out.print("On the ");

            switch (Day)

            {

                case 1:
                    System.out.print( "1st" );
                    break;
                case 2:
                    System.out.print( "2nd" );
                    break;
                case 3:
                    System.out.print( "3rd" );
                    break;
                case 4:
                    System.out.print( "4th" );
                    break;
                case 5:
                    System.out.print( "5th" );
                    break;   
                case 6:
                    System.out.print( "6th" );
                    break;
                case 7:
                    System.out.print( "7th" );
                    break;
                case 8:
                    System.out.print( "8th" );
                    break;
                case 9:
                    System.out.print( "9th" );
                    break;
                case 10:
                    System.out.print( "10th" );
                    break;
                case 11:
                    System.out.print( "11th" );
                    break;
                case 12:
                    System.out.print( "12th" );
                    break;   

            }

            System.out.println(" day of Christmas, my true love gave to me:" );

            switch (Day)

            {

                case 12:
                    System.out.println( "twelve lords-a-leaping," );
                
                case 11:
                    System.out.println( "eleven pipers piping," );
                    
                case 10:
                    System.out.println( "ten lords a-leaping," );
                
                case 9:
                    System.out.println( "nine ladies dancing," );
                    
                case 8:
                    System.out.println( "eight maids a-milking," );
                
                case 7:
                    System.out.println( "seven swans a-swimming," );
                    
                case 6:
                    System.out.println( "six geese a-laying," );
                
                case 5:
                    System.out.println( "five gold rings," );
                    
                case 4:
                    System.out.println( "four calling birds," );
                    
                case 3:
                    System.out.println( "three French hens," );
                
                case 2:
                    System.out.println( "two turtle doves," );
                    
                case 1:
                    System.out.println( "a partridge in a pear tree." );

            }

        }

    }

}
