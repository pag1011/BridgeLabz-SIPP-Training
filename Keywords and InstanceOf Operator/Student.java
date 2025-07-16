class Student {
    // Static variable shared by all students
    static String universityName = "National Institute of Technology";
    static int totalStudents = 0;

    // Final variable
    private final int rollNumber;
    private String name;
    private String grade;

    // Constructor using 'this'
    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to show total students
    public static void displayTotalStudents() {
        System.out.println("Total Enrolled Students : " + totalStudents);
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("University : " + universityName);
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Current Grade : " + grade);
    }

    // Method to update grade
    public void updateGrade(String newGrade) {
        this.grade = newGrade;
    }
}