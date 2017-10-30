//Pane Elenovski
//10/28/2017
//File IO
//Goes through several texts and scans for terms

import java.io.*;
import java.util.Scanner;

public class FileIO
{
    public static void main (String []args) throws IOException
    {
        Scanner scanFile = new Scanner(new File("data\\fillmore.txt"));
        int countwords = 0, countcharacters = 0, countwar = 0, countfreedom = 0;
        double average = 0.0;
        char letter;
        String line1 = "", line2 = "", word = "";

        System.out.println(scanFile.nextLine());
        System.out.println(scanFile.nextLine());
        while (scanFile.hasNext())
        {
            word = scanFile.next();
            countcharacters = word.length() + countcharacters;
            countwords++;
            if (word.contains("war"))
                countwar++;

            if (word.contains("freedom"))
                countfreedom++;
        }
        average = countcharacters/countwords;
        System.out.println("The average length of each word: " + average);
        System.out.println("The total number of words: " + countwords);
        System.out.println("The word 'war' was said " + countwar + " times");
        System.out.println("The word 'freedom' was said " + countfreedom + " times");


    }
}


//OUTPUT:

//1850
//Millard Filmore
//The average length of each word: 4.0
//The total number of words: 8318
//The word 'war' was said 11 times
//The word 'freedom' was said 1 times
//Press any key to continue . . .