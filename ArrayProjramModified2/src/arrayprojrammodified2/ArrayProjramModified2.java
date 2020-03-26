/*
 Riley Denoon
ArrayProgramModified2 
March 25th 2020
 */
package arrayprojrammodified2;

import java.util.Scanner;

/**
 *
 * @author Riley
 */
public class ArrayProjramModified2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        //declare all of the variables 
        double [ ] marks = {34.7, 54.1, 34.8, 99.6, 43.6, 43.2, 65.5, 44.8, 88.6};
        double total=0;
        double average;
        
        //Display "These are the marks" out to the user 
        System.out.println("These are the marks:");
        //When this is true, display the marks out to the user 
        for (int i = 0; i<=8; i= i + 1)
        {
           System.out.println(marks[i]);
        }
        //When this is true the total marks will be this 
        for (int i = 0; i<=8; i= i + 1)
        {
            total = total + marks[i];
        }
        //calculate the value of the average (total marks by 9(amount in array)
        average = total/9;
        //multiply by 10 to use Math.round on the variable average 
        average = average * 10;
        average = Math.round(average);
        //divide by 10 to complete using Math.round on the  variable average 
        average = average/10;
        
        //display "The average mark is" to the user 
        System.out.println("The average mark is:");
        //display the newly calculated variable average to the user
        System.out.println(average);
    }
    
}
