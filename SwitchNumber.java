import java.util.Scanner;
/**
 * This application is used to convert integers to roman numerals, specifically using
 * a switch statement in the cases of 1-3. If anything else is entered, then it is 
 * considered invalid.
 * @author Dillon Roberto, droberto@student.sdccd.edu
 * @since 9/17/2025
 * @version v1.0
 */
public class SwitchNumber {
    public static void main(String[] args) {
        //integer data type made for users number input
        int numEntered;
       
        //reference input is made for scanner object to be created
        Scanner input = new Scanner(System.in);
        
        //user prompted to enter number
        System.out.print("Enter an integer between 1 and 3: ");
        numEntered = input.nextInt();
        
        //cases made for each possible user input
        switch(numEntered) {
            case 1:               //user enters number 1
                System.out.println("\n1 converted to Roman Numeral is I.");
                break;
            case 2:               //user enters number 2
                System.out.println("\n2 converted to Roman Numeral is II.");
                break;
            case 3:               //user enters number 3
                System.out.println("\n3 converted to Roman Numeral is III.");
                break;
            default:              //user did not enter number from 1-3
                System.out.println("\nInvalid entry.");
                break;
        }
    }
}