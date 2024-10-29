import java.util.Scanner;

// Class for Marksheet
class Marksheet {
    private String studentName;
    private double totalMarks;
    private double obtainedMarks;
    private double percentage;
    private String grade;
    private double gpa;

    // Constructor
    public Marksheet(String studentName, double totalMarks, double obtainedMarks) {
        this.studentName = studentName;
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtainedMarks;
    }

    // Method to calculate percentage
    public void calculatePercentage() {
        this.percentage = (obtainedMarks / totalMarks) * 100;
    }

    // Method to determine grade based on percentage
    public void determineGrade() {
        if (percentage >= 90) {
            grade = "A+";
            gpa = 4.0;
        } else if (percentage >= 80) {
            grade = "A";
            gpa = 3.7;
        } else if (percentage >= 70) {
            grade = "B+";
            gpa = 3.3;
        } else if (percentage >= 60) {
            grade = "B";
            gpa = 3.0;
        } else if (percentage >= 50) {
            grade = "C";
            gpa = 2.5;
        } else {
            grade = "F";
            gpa = 0.0;
        }
    }

    // Method to display the mark sheet
    public void displayMarksheet() {
        System.out.println("\n================ MARKSHEET =================");
        System.out.printf("Student Name   : %s\n", studentName);
        System.out.printf("Total Marks    : %.2f\n", totalMarks);
        System.out.printf("Obtained Marks : %.2f\n", obtainedMarks);
        System.out.printf("Percentage     : %.2f%%\n", percentage);
        System.out.printf("Grade          : %s\n", grade);
        System.out.printf("GPA            : %.2f\n", gpa);
        System.out.println("=============================================");
    }
}

// Main Class
public class MarksheetGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for student details
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        double totalMarks = 0.0;
        double obtainedMarks = 0.0;

        // Input validation for total marks
        while (true) {
            System.out.print("Enter Total Marks: ");
            if (scanner.hasNextDouble()) {
                totalMarks = scanner.nextDouble();
                if (totalMarks > 0)
                    break;
                else
                    System.out.println("Total Marks should be greater than 0. Please try again.");
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear invalid input
            }
        }

        // Input validation for obtained marks
        while (true) {
            System.out.print("Enter Obtained Marks: ");
            if (scanner.hasNextDouble()) {
                obtainedMarks = scanner.nextDouble();
                if (obtainedMarks >= 0 && obtainedMarks <= totalMarks)
                    break;
                else
                    System.out.println("Obtained Marks should be between 0 and Total Marks. Please try again.");
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear invalid input
            }
        }

        // Create Marksheet object
        Marksheet marksheet = new Marksheet(studentName, totalMarks, obtainedMarks);

        // Calculate percentage, determine grade, and display the result
        marksheet.calculatePercentage();
        marksheet.determineGrade();
        marksheet.displayMarksheet();

        scanner.close();
    }
}
