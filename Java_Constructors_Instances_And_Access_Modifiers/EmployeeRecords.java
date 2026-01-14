import java.util.Scanner;

public class EmployeeRecords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int employeeID;
		String department;
		double salary;
		
		System.out.println("Enter the Employee ID : ");
		employeeID = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the department : ");
		department = sc.nextLine();
		System.out.println("Enter the Salary : ");
		salary = sc.nextDouble();
		
		Employee emp = new Employee(employeeID, department, salary);
		emp.display();
		sc.nextLine();
		
		System.out.println("Enter the new salary for employee : ");
		double newSalary = sc.nextDouble();
		emp.setSalary(newSalary);
		System.out.println("Updated Salary : " + emp.getSalary());
        sc.nextLine();
        
        System.out.println("\nEnter Manager ID : ");
        int managerID = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter Manager Department : ");
        String managerDept = sc.nextLine();
        System.out.println("Enter Manager Salary : ");
        double managerSalary = sc.nextDouble();
        
        Manager mangr = new Manager(managerID, managerDept, managerSalary);
        mangr.displayManagerInfo();
        sc.nextLine();
        
        System.out.println("Enter new salary for Manager : ");
        double newManagerSalary = sc.nextDouble();
        mangr.setSalary(newManagerSalary);
        System.out.println("Updated Manager Salary: " + mangr.getSalary());
	}
}
