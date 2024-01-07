//name: Sara Russert
//date: 1/7/24
//file: GetLetterGrade.java

// Add the needed import statement for Scanner or JOptionPane
import java.util.Scanner;

public class GetLetterGrade {
   public static void main(String[] args){
      
      // Declare constants for the four grade cutoff values
      final int A_VALUE = 90, B_VALUE = 80, C_VALUE = 70, D_VALUE = 60;
 
      // Declare variable for the student’s numerical grade
      int studentGrade;
      
      // Declare a data type char variable to store the student’s letter grade
      char letterGrade;
      
      // Collect user input for the student’s numerical grade
      // You may use a Scanner object or JOptionPane input dialog
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the student's numerical grade:  ");
      studentGrade = keyboard.nextInt();
      
      // Use an if-else-if decision statement to determine the letter grade
      if (studentGrade >= A_VALUE)
         letterGrade = 'A';
      else if (studentGrade >= B_VALUE)
         letterGrade = 'B';
      else if (studentGrade >= C_VALUE)
         letterGrade = 'C';
      else if (studentGrade >= D_VALUE)
         letterGrade = 'D';
      else 
         letterGrade = 'F';
         
      // Display the results to the user
      System.out.println("The student's numerical grade is: " + studentGrade);
      System.out.println("The numerical grade " + studentGrade + " corresponds to the letter grade: " + letterGrade);
   }

}