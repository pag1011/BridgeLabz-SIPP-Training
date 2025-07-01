
import java.util.Scanner;

class Student {
	String name;
	int rollNumber;
	double marks;
	
	//Constructor
	Student(String name, int rollNumber, double marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	
	//Method to calculate the grades of students
	String calculateGrades() {
		if(marks >= 90) {
			return "A"; 
		} else if(marks >= 75) {
			return "B"; 
		} else if(marks >= 60) {
			return "C"; 
		} else if(marks >= 40) {
			return "D"; 
		} else {
			return "F"; 
		}
	}
	
	//Method to display the students grades
	void display() {
		System.out.println("Name : " + name);
		System.out.println("Roll number : " + rollNumber);
		System.out.println("Marks : " + marks);
		System.out.println("Grade : " + calculateGrades());
	}
}

public class StudentReport {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		int rollNumber;
		double marks;
		
		//Take input user 
		System.out.println("Enter the name of student : ");
		name = sc.nextLine();
		System.out.println("Enter the roll number of student : ");
		rollNumber = sc.nextInt();
		System.out.println("Enter the marks of student : ");
		marks = sc.nextDouble();
		
		//Create s1 object for students
		Student s1 = new Student(name, rollNumber, marks);
		
		//Display the details of students
		s1.display();

	}

}
