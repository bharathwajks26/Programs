import java.util.Scanner;

class Student {
    int marks1, marks2, marks3, marks4, marks5, marks6;
    int total;
    double aggregate;

    Student(int m1, int m2, int m3, int m4, int m5, int m6) {
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
        marks4 = m4;
        marks5 = m5;
        marks6 = m6;
    }
    public double calculateAggregate() {
        total = marks1 + marks2 + marks3 + marks4 + marks5 + marks6;
        aggregate = total / 6.0;
        return aggregate;
    }    
}
class GradeDeterminer {
    public static String determineGrade(double aggregate) {
        if (aggregate > 75) {
            return "DISTINCTION";
        } else if (aggregate >= 60) {
            return "First Division";
        } else if (aggregate >= 50) {
            return "Second Division";
        } else if (aggregate >= 40) {
            return "Third Division";
        } else {
            return "FAIL";
        }
    }}
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks in Python: ");
        int marks1 = sc.nextInt();
        System.out.print("Enter the marks in C Programming: ");
        int marks2 = sc.nextInt();
        System.out.print("Enter the marks in Mathematics: ");
        int marks3 = sc.nextInt();
        System.out.print("Enter the marks in Physics: ");
        int marks4 = sc.nextInt();
        System.out.print("Enter the marks in Chemistry: ");
        int marks5 = sc.nextInt();
        System.out.print("Enter the marks in Professional Ethics: ");
        int marks6 = sc.nextInt();

        // Create a Student object
        Student student = new Student(marks1, marks2, marks3, marks4, marks5, marks6);

        // Calculate the aggregate
        
        double aggregate = student.calculateAggregate();

        // Determine the grade
        String grade = GradeDeterminer.determineGrade(aggregate);

        System.out.println("Total = " + student.total);
        System.out.println("Aggregate = " + String.format("%.2f", aggregate));
        System.out.println("Class: " + grade);
        sc.close();
    }
}
