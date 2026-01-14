
import java.util.Scanner;

class Employee {
	String name;
	int id;
	double salary;
	
	//Constructor to initialize employee details
	Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	//Method to display employee details
	void display() {
		System.out.println("Employee Name : " + name);
		System.out.println("Employee ID : " + id);
		System.out.println("Salary : Rs." + salary);
	}
}

public class Employees {
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc = new Scanner(System.in);
		String name;
		int id;
		double salary;
		
		//Taking input for user
		System.out.println("Enter the name of the employee : ");
		name = sc.nextLine();
		
		System.out.println("Enter the employee id : ");
		id = sc.nextInt();
		
		System.out.println("Enter the employee salary : ");
		salary = sc.nextDouble();
		
		//Create employee object with user input
		Employee emp = new Employee(name, id, salary);
		
		//Display employee details
		emp.display();
		
	}
}