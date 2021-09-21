//Omkar
//4-14-2021
//Desc: Allow the user to enter some number of words: 
import java.util.Scanner;
public class WordList 

{
   
    public static void main(String[] args)

    {

        Scanner input = new Scanner(System.in);

        //Create any variables:
        String word;
        int size;


        //Prompt the user to determine the number of words to enter

        System.out.println("How many words to enter?");
        size = input.nextInt();

        //Create an array of that side
        String[] allWords = new String[size];

        //loop through that many times
        for(int i = 0; i < allWords.length; i++)
        {

            //prompt the user to enter a word

            System.out.println("Enter a Word: ");
            word = input.next();

            //store it in the Array
            allWords[i] = word;

        }
            
        
        //print results
        for(int k = 0; k < allWords.length; k++)
        {

            System.out.print(allWords[k] + " ");

        }

    }
    
}
