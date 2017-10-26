/********************************************************************
// These are the notes for ch 3 used in hayes class


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.Scanner;

import java.io.*;       //for File IO

public class ch3notes2017
{
    Integer one = 1;
    //enum is a special set of data you set up
    enum Classes  {CalculusAB, English, SpanishIII, Gym, Lunch, APCS, APush, Photo} //collection of data that restricts the user to only use the set on data
    enum Grades {A,B,C,D,F}
    enum Week {Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}

      public static void main (String [] args) throws IOException // required for File IO
   {
       DecimalFormat fmt = new DecimalFormat ("0.###");
       Scanner keyboard = new Scanner(System.in);
       Integer two = 2;
       Grades mygrade = Grades.A;
       Grades yourgrade = Grades.B;
       System.out.println(yourgrade.compareTo( mygrade) );
       String[] people = {"Deepa", "Trevor", "Murugan", "Emy",
                          "Thomas", "Charlie",
                          "heinz doofenshmirtz", "Michael",
                          "NoOne", "Bueller","Justin","David","PaneTheMane"}; //Array is a list

       //for each loop - goes thru a collection
       for (String person: people)
       {
           
        }
        


/*    int wordCount = 0, characterCount = 0;
             String line, word;
             StringTokenizer tokenizer;

             System.out.println ("Please enter text");

             line = Keyboard.readString();

                tokenizer = new StringTokenizer (line,"/");


        x = Integer.parseInt(input);
        System.out.print(x);





*/ //WHAT WILL OUTPUT?

    int k =0, j=0;

    System.out.println("k \tj");
    
    //k j
    //1 0
    //2 1
    //3 3
    //4 6
    //5 10
    //6 15
    //7 21

    //for(j=0; j<20; j+=k)
    for( ; ; System.out.print("hello"))
    {
        k++;
        System.out.println(k + "\t" + j);
    }

    //System.out.println("After the loop \n k= " +k +"\tj= " +j);



    Scanner scanFile = new Scanner(new File("people.txt"));
    String name, address, phone;

    while(scanFile.hasNext())
    {

    }





    //file must be in same place as app
    //Scanner scanFile = new Scanner(new File ("state of the union 2011.txt"));

    //Relative path - looks for data folder in same place as app
    //Scanner scanFile = new Scanner
    //(new File ("data\\obamatakebackamerica.txt"));
    //Scanner scanFile = new Scanner
    //(new File ("data/Debate12016.txt"));
    //Scanner scanFile = new Scanner(new File ("jimmy carter a crisis of confidence.txt"));
    //new File ("H:\AP Computer Science A\Chapter 3\chapter3-loops-repo-pelenovski\Chapter3B Starter Code");
/**/
    String word;
    int count_p = 0, count_y = 0, count_a = 0, count_words = 0, count_j = 0;

    while (scanFile.hasNextDouble())
    {

        word = scanFile.next();
        count_words ++;
        if (word.equalsIgnoreCase("jobs") && (word.equalsIgnoreCase("Jobs")))
        {
            count_j ++;
        }
        //System.out.print("Jobs or jobs is found ",count_j," times");
        if (word.equalsIgnoreCase("america") && (word.equalsIgnoreCase("Jobs")))
        {
            count_a ++;
        }
        //System.out.print("america or America is found ",count_a," times");
        
        System.out.println(word  );



    }//end of while
    System.out.println("The speech has " + count_words+" words");

//_______________________basic for and scope of i________________________
/**/
        //ini - only happens once!
        //middle/test = #1 T/F
        //body #2 exc the main part of loop
        //last #3 exc this part of for loop
        // ini          test     inc
        int total = 0;
/**/  for(int i = 0 ; i < 20 ; i++ )
    {//body
        System.out.print("Hi" + i + "\n");
        total += i;
    }

    //System.out.print("After the Loop" + i + "\n");




//--- While loop and sentinel value


//
    int test;
    System.out.println("Guess my favorite number \n" +
                            "it is between 1-20");
    test = keyboard.nextInt();

    while (test != -9999)
    {
        if (test == 12)
            System.out.println
                ("it the age of my sons"+
                " Thomas and Charlie");
        else
            System.out.println("Guess again, or -9999 to end the program");

        test = keyboard.nextInt();

    }
/*  
    double input, avg, num = 0;
    System.out.print("Please enter some numbers");
    //Scanner is an iteratoor moves thru a collection
    while (keyboard.hasNextDouble())//anymore in my collection, are we at the end?
    {
        input = keyboard.nextDouble();//grab the next data and move on
        // | 12 23 34 45 56 67 78 Q//calling the next method
        // 12 | 23 34 45 56 67 78 Q
        // 12 23 | 34 45 56 67 78 Q
        // 12 23 34 | 45 56 67 78 Q
        // 12 23 34 45 | 56 67 78 Q
        num++;
        avg++;
    }
    System.out.println("Thank you, please come again");
    System.out.print("Average"+ avg/num);

/*    int i =0;//#1

        while (i<10)//#2
        {
            System.out.print( "i =" + i +"\n");
            i++;//#3 ++ inc by 1, other number would be i+=2
        }





/*  */

   }// end of main

}// end of class









