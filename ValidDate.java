import java.util.Scanner;
/**
 * This application will determine if the date submitted is valid. The user will enter a date as
 * mm/dd/yyyy and the scanner will assign day, month, year. Then general conditions must be met 
 * such as days within the range of 1-31 and months being with the range 1-12. 
 * If at any time dateIsValid is set to false, a statement will be created saying mm/dd/yyyy 
 * is not a valid date with a separate output explaining why it failed at the step.
 * Then a determination is made if it is a leap year. Next an amount of days per month limit is
 * imposed with January, March, May, July, August, October, December aka months 1, 3, 5, 7, 8, 10, 
 * and 12 respectively must be <=31 days for date to be valid, and if months 4, 6, 9, or 11, 
 * then days must be <=30. If febuary (2) and a leap year, days must be <=29, if not <=28.
 * If at the end dateIsValid is true, then output mm/dd/yyyy is a valid date.
 * @author Dillon Roberto, droberto@student.sdccd.edu
 * @since 9/17/2025
 * @version v1.0
 */
public class ValidDate {
    public static void main(String[] args) {
        int month, day, year;                         //allows storeage of month, day, year
        boolean dateIsValid = true;                   //default assignment until fails checks
        boolean isLeapYear = false;                   //default assignment unless passes check
        String whyInvalid = "";
       
        //reference input is made for scanner object to be created
        Scanner input = new Scanner(System.in);
        input.useDelimiter("/");                      //switches whitespace to "/"
        
        //user prompted to enter numbers in a specified format
        System.out.print("Enter a date (mm/dd/yyyy): ");
        month = input.nextInt();                      //mm stored as integer
        day = input.nextInt();                        //dd stored as integer
        String temp = input.nextLine().substring(1);  //reads "/yyyy" and eliminates "/"
        year = Integer.parseInt(temp);                //yyyy set as int and stored as integer
        
        //general month range check
        if (month < 1 || month > 12) {
            dateIsValid = false;
            whyInvalid = "Months must be 1 to 12.";
        }
        
        //general day range check
        if (dateIsValid && day < 1) {
            dateIsValid = false;
            whyInvalid = "Days must be at least 1.";
        }
        else if (dateIsValid && day >31) {
            dateIsValid = false;
            whyInvalid = "Cannot have more than 31 days in any month.";
        }

        //Leap year check
        if ( (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ) {
            isLeapYear = true;
        }

        //days in month check (only if month was valid)
        if (dateIsValid) {
            int maxDays;
            //sets max days for January, March, May, July, August, October, December
            if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) {
                maxDays = 31;
            //sets max days for April, June, September, November
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                maxDays = 30;
            //sets max days for February
            } else {
                maxDays = (isLeapYear ? 29 : 28);
            }
            
            //checks if days exceed the set maxDays
            if (day > maxDays) {
                dateIsValid = false;
                whyInvalid = "Cannot have " + day + " days in this month.";
                if ( (month == 2) && (isLeapYear == false) && (day == 29) ) {
                    whyInvalid = "Cannot have 29 or more days in a non-leap year.";
                }
            }
        }

        //Output statements if valid or invalid date
        if (dateIsValid) {
            System.out.println(month + "/" + day + "/" + year + " is a valid date.");
        } else {
            System.out.println(month + "/" + day + "/" + year + " is not a valid date. " + whyInvalid);
        }
    }
}