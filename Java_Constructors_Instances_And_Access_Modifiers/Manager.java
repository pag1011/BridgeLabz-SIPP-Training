public class Manager extends Employee {

    // Constructor
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerInfo() {
        System.out.println("\n---- Manager Details ----");
        System.out.println("Employee ID : " + employeeID);       
        System.out.println("Department : " + department);        
    }
}
