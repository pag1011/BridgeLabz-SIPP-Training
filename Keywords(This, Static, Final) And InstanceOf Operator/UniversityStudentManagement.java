import java.util.Scanner;

public class UniversityStudentManagement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Input for first student
        System.out.print("Enter Student Name : ");
        String name1 = sc.nextLine();
        System.out.print("Enter Roll Number : ");
        int roll1 = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Grade : ");
        String grade1 = sc.nextLine();

        Student s1 = new Student(name1, roll1, grade1);

        // Input for second student
        System.out.print("\nEnter another Student Name : ");
        String name2 = sc.nextLine();
        System.out.print("Enter Roll Number : ");
        int roll2 = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Grade : ");
        String grade2 = sc.nextLine();

        Student s2 = new Student(name2, roll2, grade2);

        // update grade
        System.out.print("\nEnter new grade for first student : ");
        String newGrade1 = sc.nextLine();
        if (s1 instanceof Student) {
            s1.updateGrade(newGrade1);
        }

        // Display details
        System.out.println("\n--- Student Details ---");
        if (s1 instanceof Student) {
            s1.displayStudentDetails();
        }

        System.out.println();

        if (s2 instanceof Student) {
            s2.displayStudentDetails();
        }

        // Display total students
        System.out.println();
        Student.displayTotalStudents();
	}
}
