import java.util.Scanner;

public class UniversityManagementSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rollNumber;
		String name;
		double CGPA;
		
		System.out.println("Enter the roll number : ");
		rollNumber = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name : ");
		name = sc.nextLine();
		System.out.println("Enter the CGPA : ");
		CGPA = sc.nextDouble();
		
		Student s1 = new Student(rollNumber, name, CGPA);
		s1.display();
		
		System.out.println("Enter the updated CGPA : ");
		s1.setCGPA(sc.nextDouble());
		System.out.println("Updated CGPA : " + s1.getCGPA());
		sc.nextLine();
		
		System.out.println("Enter PG student roll number : ");
		int pgRoll = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter PG student name : ");
		String pgName = sc.nextLine();
		System.out.println("Enter PG student CGPA : ");
		double pgCGPA = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter PG student specialization : ");
		String specialization = sc.nextLine();
		
		PostgraduateStudent pgStudent = new PostgraduateStudent(pgRoll, pgName, pgCGPA, specialization);
		pgStudent.displayPostgradInfo();
	}
}
