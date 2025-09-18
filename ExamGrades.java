import java.util.Scanner;
/**
 * This is designed to calculate an average (to 1 decimal place) score between 3 exams,
 * and output its associated letter grade. the grading scheme is as follows:
 * 90–100 A, 80–89 B, 70–79 C, 60–69 D, Below 60 F.
 * @author Dillon Roberto, droberto@student.sdccd.edu
 * @since 9/17/2025
 * @version v1.0
 */
public class ExamGrades {
    public static void main(String[] args) {
        //int for user whole number grade inputs, double for avg calulation, char for letter
        int exam1, exam2, exam3;
        double avgReport;
        char letterGrade;
       
        //reference input is made for scanner object to be created
        Scanner input = new Scanner(System.in);
        
        //user prompted to enter exam scores individually
        System.out.print("Enter Exam 1 score: ");
        exam1 = input.nextInt();
        System.out.print("Enter Exam 2 score: ");
        exam2 = input.nextInt();
        System.out.print("Enter Exam 3 score: ");
        exam3 = input.nextInt();
        
        //calculates average score of exams 1-3 and prints average to 1 decimal place
        avgReport = (exam1 + exam2 + exam3)/3.0;
        System.out.print("With an avg score of ");
        System.out.printf("%.1f", (avgReport));
        
        //grade scale has <60 is F, intermediate D,C,B,A with 100 is max.
        if (avgReport <60) {
            letterGrade = 'F';
        }
        else if (avgReport < 70) {
            letterGrade = 'D';
        }
        else if (avgReport < 80) {
            letterGrade = 'C';
        }
        else if (avgReport < 90) {
            letterGrade = 'B';
        }
        else if (avgReport <=100) {
            letterGrade = 'A';
        }
        else {
            System.out.println("\ninvalid entry(s)");
            return; //scanner will catch invalid characters/inputs
        }           //ensures average exceeding 100 is caught as invalid
        
        //prints asscociated letter grade
        System.out.println("\nYour grade is: " + letterGrade);
    }
}