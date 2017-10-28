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
        Scanner scanFile = new Scanner(new File("data\\speech1.txt"));
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
                count_peace++;

            if (word.contains("freedom"))
                count_people++;
        }
        avg = countcharacters/countwords;
        System.out.println("The average length of each word: " + average);
        System.out.println("The total number of words: " + countwords);
        System.out.println("The word 'war' was said " + countwar + " times");
        System.out.println("The word 'freedom' was said " + countfreedom + " times");


    }
}