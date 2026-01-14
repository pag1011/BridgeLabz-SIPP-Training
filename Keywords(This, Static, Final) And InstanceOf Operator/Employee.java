class Employee {
    // Static variable
    static String companyName = "Tech Solutions Ltd.";
    static int totalEmployees = 0;

    // Final variable
    private final int id;
    private String name;
    private String designation;

    // Constructor using 'this'
    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method
    public static void displayTotalEmployees() {
        System.out.println("Total Employees : " + totalEmployees);
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Company Name : " + companyName);
        System.out.println("Employee ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Designation : " + designation);
    }
}