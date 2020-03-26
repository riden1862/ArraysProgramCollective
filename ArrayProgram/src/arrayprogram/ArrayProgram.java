/*
Riley Denoon
ArrayProgram
March 25th 2020
 */
package arrayprogram;

import java.util.Scanner;

/**
 *
 * @author Riley
 */
public class ArrayProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        
        int [ ] numbers = new int [20];
        // 20 intergers will be stored in the array 
        int total = 0;
        
        System.out.println("Enter twenty integers and they will be added together:");
        for (int i = 0; i <= 19; i = i + 1)
            //when 1 =0, i<=19 (19 array)
        {
           numbers[i] = keyedInput.nextInt();
           // retrieve the numbers from the keyed input 
        }
        

        for (int i = 0; i <= 19; i = i + 1)
        {
             total = total + numbers[i];
             //the total number = 0 + all the intergers in the array. 
        }
        
        System.out.println("The sum of those numbers is:");
        System.out.println(total);
    }
    
}
