public class Employee {
	public int  employeeID;
	protected String department;
	private double salary;
	
	//Constructor
	public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
	
	// Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public method to get salary (for optional display)
    public double getSalary() {
        return salary;
    }
    
    public void display() {
    	System.out.println("\n---- Employee Details ----");
    	System.out.println("Employee ID : " + employeeID);
    	System.out.println("Department : " + department);
    	System.out.println("Salary : " + salary);
    }
}
