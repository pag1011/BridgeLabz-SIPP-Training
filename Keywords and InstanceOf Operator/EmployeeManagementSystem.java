import java.util.Scanner;

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Input for first employee
        System.out.print("Enter Employee Name : ");
        String name1 = sc.nextLine();
        System.out.print("Enter Employee ID : ");
        int id1 = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Designation : ");
        String desig1 = sc.nextLine();

        Employee emp1 = new Employee(name1, id1, desig1);

        // Input for second employee
        System.out.print("\nEnter another Employee Name : ");
        String name2 = sc.nextLine();
        System.out.print("Enter Employee ID : ");
        int id2 = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Designation : ");
        String desig2 = sc.nextLine();

        Employee emp2 = new Employee(name2, id2, desig2);

        // Using instanceof operator before displaying
        System.out.println("\n--- Employee Details ---");

        if (emp1 instanceof Employee) {
            emp1.displayDetails();
        }

        System.out.println();

        if (emp2 instanceof Employee) {
            emp2.displayDetails();
        }

        // Static method call
        System.out.println();
        Employee.displayTotalEmployees();
	}
}
