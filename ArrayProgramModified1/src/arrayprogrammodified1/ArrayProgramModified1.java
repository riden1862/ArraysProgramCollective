/*
Riley Denoon
ArrayProgramModified1
March 25th 2020
 */
package arrayprogrammodified1;

import java.util.Scanner;

/**
 *
 * @author Riley
 */
public class ArrayProgramModified1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        
        String [ ] friends = new String [5];
        //will hold an array of five string values 
        
        System.out.println("Enter the names of five friends:");
        for (int i = 0; i <= 4; i = i + 1)
            //when i is less than or equal to for do this:
        {
            friends[i] = keyedInput.nextLine();
            //retrieve the names of friends from the keyedinput 
        }
        
        System.out.println("The second, third and fourth names listed were:");
        //print to the user that the second, third, and fourth names listed were:
        System.out.println("Second: " + friends[1]);
        //display that the "Second:" was (insert name from array)
        System.out.println("Third: " + friends[2]);
        //display that the "Third:" was (insert name from array)
        System.out.println("Fourth: " + friends[3]); 
        //display that the "Fourth:" was (insert name from array)
    }
    
}