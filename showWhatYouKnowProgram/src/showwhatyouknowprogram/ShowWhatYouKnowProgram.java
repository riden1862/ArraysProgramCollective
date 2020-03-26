/*
 Riley Denoon
showWhatYouKnowProgram
March 26th 2020
 */
package showwhatyouknowprogram;

import java.util.Scanner;

/**
 *
 * @author Riley
 */
public class ShowWhatYouKnowProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //is using a scanner to get the marks 
        Scanner keyedInput = new Scanner (System.in);
        
        //the array is made of intergers, called marks. Can hold 5 values 
        int [] marks = new int [5];
        
        //declare variables that are being used 
        int total = 0;
        final int totalMarksEntered = 5;
        int average;
        
        //prompt the user for their last five marks 
        System.out.println("Please enter your five most recent marks");
        //use a for loop get the 5 marks the user will enter 
         for (int i = 0; i <= 4; i = i + 1)
         {
        //the values they enter will be stored as the marks 
        marks [i] = keyedInput.nextInt();
    }
         
        for (int i = 0; i <= 4; i = i +1 )
        {
         total = total + marks[i];
    }
        //calculate the average of the five marks the user entered 
        //do this by diving total by totalmarksEntered to get an average
        average = total/totalMarksEntered;
        //multiply aveage by 10 to get ready to use Math.round
        average = average * 10;
        // use Math.round on the average variable 
        average = Math.round(average);
        //divide average by 10 to complete using Math.round 
        average = average / 10;
        
        //display the calculated value to the user 
        System.out.println("This is your average:");
        System.out.println(average);
    }
}
 

