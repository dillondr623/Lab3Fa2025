import java.util.Scanner;
/**
 * Given 3 integers, this application will print the three numbers in ascending order.
 * @author Dillon Roberto, droberto@student.sdccd.edu
 * @since 9/17/2025
 * @version v1.0
 */
public class SortingNumbers {
    public static void main(String[] args) {
        //int for all 3 numbers to be stored
        int firstNum, secNum, thirdNum;
       
        //reference input is made for scanner object to be created
        Scanner input = new Scanner(System.in);
        
        //user prompted to enter numbers individually
        System.out.print("Enter first number: ");
        firstNum = input.nextInt();
        System.out.print("Enter second number: ");
        secNum = input.nextInt();
        System.out.print("Enter third number: ");
        thirdNum = input.nextInt();
        
        
        //Condition 1: 1st is smaller than 2nd and 3rd
        if ( (firstNum < secNum) && (firstNum < thirdNum) ) {
            System.out.print(firstNum + " ");
            if (secNum < thirdNum) {
                System.out.println(secNum + " " + thirdNum);
            }   //Output 1st, 2nd, 3rd
            else {
                System.out.println(thirdNum + " " + secNum);
            }   //Output 1st, 3rd, 2nd
            
        //Condition 2: 2nd is smaller than 1st and 3rd
        } else if ( (secNum < firstNum) && (secNum < thirdNum) ) {
            System.out.print(secNum + " ");
            if (firstNum < thirdNum) {
                System.out.println(firstNum + " " + thirdNum);
            }   //Output 2nd, 1st, 3rd
            else {
                System.out.println(thirdNum + " " + firstNum);
            }   //Output 2nd, 3rd, 1st
            
        //Condition 3: 3rd is smaller than 1st and 2nd
        } else {
            System.out.print(thirdNum + " ");
            if (firstNum < secNum) {
                System.out.println(firstNum + " " + secNum);
            }   //Output 3rd, 1st, 2nd
            else {
                System.out.println(secNum + " " + firstNum);
            }   //Output 3rd, 2nd, 1st
        }
    }
}