import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String grade;

    // Constructor to initialize student details
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student[] students = new Student[n];

        // Get details for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Grade: ");
            String grade = scanner.nextLine();

            students[i] = new Student(name, age, grade);
        }

        // Display details of all students
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.displayDetails();
            System.out.println();
        }

        scanner.close();
    }
}